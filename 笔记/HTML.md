HTML

基本语法：

html标签：分为两种

1、有开始，有结束，用于封装数据。<name> 数据</name>

2、有开始，直接内部结束，功能的标签。 <haha/>



| font |  | color | 



功能性标签：

| br/      | hr     |
| -------- | ------ |
| 换行标签 | 分割线 |

<hr color="red"/>

列表：

​	1、确定列表的范围。<dl>

​	2、在范围中，分上层项目<dt>,和下层项目<dd>.

```html
<dl>	    
<dt>部门名称</dt>
	<dd>技术部<dd>
	<dd>财务部<dd>
	<dd>测试部<dd>
	<dl>
```

​	3、带有序列标识的项目列表<ol>每一个列表项目都有<li>封装。

```HTML
<ol>
	<li>有序项目<li>
	<li>有序项目<li>
<ol>
```

4、带有无序标识的项目列表<ul>

```html
<ul>
	<li>有序项目<li>
	<li>有序项目<li>
<ul>
```



图片：

~~~html
插入图片：<img alt = "图片说明" src="图片路径" height="图片高，单位px" width="图片宽，单位px" border="边框">
~~~













