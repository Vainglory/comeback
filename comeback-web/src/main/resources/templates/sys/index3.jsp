<%--
  Created by IntelliJ IDEA.
  User: 搞事情
  Date: 2018/10/16
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script type="text/javascript" src="static/js/easyui-1.4/jquery.min.js"></script>
        <script type="text/javascript" src="static/js/easyui-1.4/jquery.easyui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="static/js/easyui-1.4/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="static/js/easyui-1.4/themes/metro/easyui.css">

        <script type="text/javascript" src="static/datagrid-groupview.js"></script>
        <link rel="stylesheet" type="text/css" href="static/js/upload/js/webuploader.css">
        <script type="text/javascript" src="static/js/upload/js/webuploader.js"></script>
    </head>
    <body class="easyui-layout">

    <div id="tt" class="easyui-tabs" style="height: 800px">
        <div title="首页" style="padding:80px;display:none;">

        </div>
        <div title="组织机构" data-options="closable:true" style="overflow:auto;padding:80px;display:none;">

            <table title="Folder Browser" id = "tt2" class="easyui-treegrid" style="width:1000px;height:800px"
                   data-options="
                url: '/all',
                method: 'get',
                rownumbers: true,
                idField: '_parentId',
                treeField: 'name'
            ">
                <thead>
                <tr>
                    <th data-options="field:'name',width:80,align:'right'">机构名称</th>
                    <th data-options="field:'type',width:80">机构类型</th>
                    <th data-options="field:'code',width:80">机构编码</th>
                    <th data-options="field:'principalId',width:80">负责人</th>
                    <th data-options="field:'path',width:80">业务覆盖区域</th>
                    <th data-options="field:'address',width:80">地址</th>
                    <th data-options="field:'phone',width:80">电话号码</th>
                    <th data-options="field:'postCode',width:80">邮政编码</th>
                    <th data-options="field:'fax',width:80">传真号</th>
                    <th data-options="field:'createTime',width:80">创建时间</th>
                    <th data-options="field:'modifyTime',width:80">修改时间</th>
                </tr>
                </thead>
            </table>
        </div>
    </div>

    <script language = "JavaScript">

        $(function(){
        });

    </script>
    </body>
</html>
