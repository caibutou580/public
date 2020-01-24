# from sqlalchemy import create_engine
# import pymysql
# import pandas as pd



# sta={ 'zhangsan':'18',
# 		'xiaoming':'20'}
# df = pd.DataFrame(sta,index = [0])
# print(df)
# conn=pymysql.connect(host='127.0.0.1',port=3306,user='root',passwd='123456',db='test',charset='utf8')
# cursor=conn.cursor() 
# # engin = create_engine("mysql+pymysql://{}:{}@{}/{}".format('root','1234546','127.0.0.1:3306','python','utf8'))
# # con=engin.connect()


# df.to_sql(name='sta',con=conn,if_exists='replace',index=False,index_label='id')

import pandas as pd
from sqlalchemy import create_engine

list_name=['张三','王五','王五','张三']
list_ids=['合肥','武汉','武汉','武汉']
df = pd.DataFrame({'姓名':list_name,'位置':list_ids})
cd=df.drop_duplicates(['姓名','位置'])
print(cd)


# import pandas as pd
# from sqlalchemy import create_engine
engine = create_engine(
    "mysql+pymysql://root:123456@localhost:3306/python?charset=utf8")

sql="CREATE TABLE sta2(name varchar(20),ids varchar(20))"
engine.execute(sql)
# engine.commit()
# cursor.close()
# conn.close()

# df = pd.DataFrame(sta,index=[0])
# print(df)
cd.to_sql(name='sta2', con=engine, if_exists='replace',
            index=False, index_label='id')
