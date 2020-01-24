## *使用docker搭建solo博客系统*

​	

​	看着身边的朋友都在搭建博客，不得不说我也很心动。可自己啥也不会。在朋友的指导下，成功搭建了一个只能自己访问的**Localhost**本地博客。没关系就算是练练手了，哈哈！慢慢来，我相信只要慢慢学，还是可以学会的。

​	*好不容易搭建的第一个博客，我想把它记下来，写进我的博客里，日后还可以随便看看。主要还是怕过一段时间忘记了。下面就开始分享一下我的本地博客操作。*

<hr>开始我的表演：👏👏
 	搭建博客需要服务器，域名，等等，***反正我没有用***主要还是自己有菜有爱玩，还没有钱，这些都是需要***花钱***的。

<font size="5" color = "red">步骤如下：</font>

<font size = "3">	1、安装Docker </font>

~~~makefile
sudo su   

apt update     更新软件包列表

apt -y install docker   下载 docker

service  docker start  	启动 docker

docker run hello-world		测试运行 hello-world
~~~



​	<font size ="3">2、安装Mysql</font>

~~~makefile
 docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.6
 # 安装mysql:5.6,直接docker run 他会自动去官方镜想下载
 # MYSQL_ROOT_PASSWORD=你的数据库密码
 
 docker exec -it mysql bash
 # docker安装的mysql默认允许远程连接，可以使用Navicat等软件连接数据库
 # 进入容器mysql
 
 mysql -uroot -p123456
 # 进入数据库 p后面跟你的密码
 
 create database solo DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
 # 创建数据库(数据库名:solo;字符集utf8mb4;排序规则utf8mb4_general_ci)
 # 出现Query OK, 1 row affected (0.00 sec)表示成功
 
 exit
 #退出数据库
 
 exit
 #退出容器
~~~



​	<font size="3">3、安装Solo</font>

~~~makefile
docker run --detach --name solo --network=host \
--env RUNTIME_DB="MYSQL" \
--env JDBC_USERNAME="root" \
--env JDBC_PASSWORD="123456" \
--env JDBC_DRIVER="com.mysql.cj.jdbc.Driver" \
--env JDBC_URL="jdbc:mysql://127.0.0.1:3306/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC" \
b3log/solo --listen_port=8080 --server_scheme=http --server_host=172.17.151.7
~~~

 

<font size = "4" color="green">注意！</font>

- `--env JDBC_PASSWORD="123456"` 将 123456 换成你的密码
- `--listen_port=8080` 监听的端口
- `--server_scheme=http` 请求方式，暂时使用 http，后面我们会换成 https
- `--server_host=www.jinjianh.com` 你的域名，如果你没有域名可以写 ip 地址
- `--rm`因为这个容器后面要删掉，带上 rm 会省很多事。

命令成功执行没有报错的话，通过`docker ps`查看执行的容器列表中是否存在 solo，存在这表示启动成功，直接访问你的域名加：8080 即可访问你的博客,
如果你尚在备案中，你可以收藏本帖，后面等备案通过了在研究后面的部分。
如果你不想使用 nginx 也不想升级 https，那么你可以先执行`docker stop solo`，然后将上面`--listen_port=8080`的`8080`换成`80`，然后去掉`--rm`，再执行一次就 ok

​	我的表演就是这些了。具体更详细的安装（反代）：[Solo详细安装](https://hacpai.com/article/1565021959471)







