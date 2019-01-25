<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>1</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap-select/1.13.4/css/bootstrap-select.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.43/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap-select/1.13.4/js/bootstrap-select.min.js"></script>
    <script src="https://cdn.bootcss.com/moment.js/2.23.0/moment-with-locales.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="../../static/js/index.js"></script>
	<link rel="stylesheet" href="../../static/css/style.css">

</head>
<body style="background: rgba(222,222,222,.3)">
	
	<div id="wrapper">
        <div class="overlay"></div>
    
        <!-- Sidebar -->
        <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
            <ul class="nav sidebar-nav">
                <li class="sidebar-brand" id="fangyuan">
                    <a href="####">
                       房源管理
                    </a>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> 待办事项 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li id="unthings"><a href="####">待处理事项</a></li>
                        <li id="donethings"><a href="####">已处理事项</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> 审批管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li id="myapproval"><a href="####">我的审批</a></li>
                        <li id="unapproval"><a href="####">待处理审批</a></li>
                        <li id="doneapproval"><a href="####">已处理审批</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> 客户服务 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li id="fixmanage"><a href="####">报修管理</a></li>
                        <li id="entrust"><a href="####">在线委托</a></li>
                        <li id="complaint"><a href="####">客户投诉</a></li>
                        <li id="watchhouse"><a href="####">预约看房</a></li>
                    </ul>
                </li>
                <li id="money">
                    <a href="####"><i class="fa fa-fw fa-cog"></i> 财务管理</a>
                </li>
                <li id="staff">
                    <a href="####"><i class="fa fa-fw fa-bank"></i> 员工管理</a>
                </li>
            </ul>
        </nav>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
          <button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas">
            <span class="hamb-top"></span>
            <span class="hamb-middle"></span>
            <span class="hamb-bottom"></span>
          </button>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <div class="container-fluid" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px">
                            <p>我的信息</p>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">编号：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 100px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">分店：</span>
                                        <select class="selectpicker">
                                            <option value="1">雨花区</option>
                                            <option value="2">海淀区</option>
                                            <option value="3">金牛区</option>
                                            <option value="4">罗湖区</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">部门：</span>
                                        <select class="selectpicker">
                                            <option value="1">一部</option>
                                            <option value="2">二部</option>
                                            <option value="3">三部</option>
                                            <option value="4">四部</option>
                                            <option value="5">五部</option>
                                        </select>
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">职务：</span>
                                        <select class="selectpicker">
                                            <option value="1">管理员</option>
                                            <option value="2">店长</option>
                                            <option value="3">财务</option>
                                            <option value="4">经理</option>
                                            <option value="5">文秘</option>
                                            <option value="6">业务</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">姓名：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 100px;" value="12">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">电话：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">入职时间：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">登录帐号：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">登录密码：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                            </div>
                            <button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m2" style="margin-top: 5px">修改信息</button>
                        </div >
                        <div style="background: rgba(245, 255, 250,.8);padding-top: 10px;padding-bottom: 10px">
                            <div class="container-fluid" style="margin-top: 50px">
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".m1">添加新员工</button>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">分店：</span>
                                        <select class="selectpicker">
                                            <option value="1">雨花区</option>
                                            <option value="2">海淀区</option>
                                            <option value="3">金牛区</option>
                                            <option value="4">罗湖区</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">部门：</span>
                                        <select class="selectpicker">
                                            <option value="1">一部</option>
                                            <option value="2">二部</option>
                                            <option value="3">三部</option>
                                            <option value="4">四部</option>
                                            <option value="5">五部</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-2">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">姓名：</span>
                                        <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 80px;" value="12">
                                    </span>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-primary">搜索</button>
                                </div>
                            </div>
                            <div class="table-responsive" style="margin-top: 30px">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>内部编号</th>
                                        <th>职务</th>
                                        <th>分店</th>
                                        <th>部门</th>
                                        <th>姓名</th>
                                        <th>电话</th>
                                        <th>入职时间</th>
                                        <th>修改</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td>110</td>
                                        <td>2019年1月1日</td>
                                        <td><a href="####">修改</a></td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>二部</td>
                                        <td>陈开</td>
                                        <td>110</td>
                                        <td>2019年1月2日</td>
                                        <td><a href="####">修改</a></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                            <div class="col-md-7"></div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">筛选房源</button>
                            </div>
                        </div>
                        <div class="row" style="margin-top: 20px">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">分店：</span>
                                        <select class="selectpicker">
                                            <option value="1">雨花店</option>
                                            <option value="2">海淀店</option>
                                            <option value="3">金牛店</option>
                                            <option value="4">罗湖店</option>
                                        </select>
                                    </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">部门：</span>
                                        <select class="selectpicker">
                                            <option value="1">一部</option>
                                            <option value="2">二部</option>
                                            <option value="3">三部</option>
                                            <option value="4">四部</option>
                                            <option value="5">五部</option>
                                        </select>
                                    </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">区域：</span>
                                        <select class="selectpicker">
                                            <option value="1">雨花区</option>
                                            <option value="2">海淀区</option>
                                            <option value="3">金牛区</option>
                                            <option value="4">罗湖区</option>
                                        </select>
                                    </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">小区：</span>
                                    <select class="selectpicker">
                                        <option value="1">春江新城</option>
                                        <option value="2">龙城一号</option>
                                    </select>
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">类型：</span>
                                    <select class="selectpicker">
                                        <option value="1">整租</option>
                                        <option value="2">合租</option>
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">户型：</span>
                                    <select class="selectpicker">
                                        <option value="1">单室套</option>
                                        <option value="2">两室套</option>
                                        <option value="3">三室套</option>
                                        <option value="4">四室套</option>
                                        <option value="5">五室及以上</option>
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房间状态：</span>
                                    <select class="selectpicker">
                                        <option value="1">已租</option>
                                        <option value="2">未租</option>
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <button type="button" class="btn btn-primary" style="margin-top: 5px">确定筛选</button>
                            </div>
                        </div>



                        <div class="container-fluid" style="margin-left: -15px;margin-top: 30px">
                            <div class="row-fluid">
                                <div class="span12">
                                    <div class="tabbable" id="tabs-967793">
                                        <ul class="nav nav-tabs">
                                            <li class="active">
                                                <a href="#p1" data-toggle="tab">房源照片</a>
                                            </li>
                                            <li>
                                                <a href="#p2" data-toggle="tab">房源信息</a>
                                            </li>
                                            <li>
                                                <a href="#p3" data-toggle="tab">业主资料</a>
                                            </li>
                                            <li>
                                                <a href="#p4" data-toggle="tab">房间信息</a>
                                            </li>
                                            <li>
                                                <a href="#p5" data-toggle="tab">租客资料</a>
                                            </li>
                                            <li>
                                                <a href="#p6" data-toggle="tab">收支明细</a>
                                            </li>
                                            <li>
                                                <a href="#p7" data-toggle="tab">业绩记录</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="p1">
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <br><br>
                                                        <button type="button" class="btn btn-primary">上传图片</button>
                                                        <br><br>
                                                        <button type="button" class="btn btn-primary">清空图片</button>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p2">
                                                <p>
                                                    第二部分内容.
                                                </p>
                                            </div>
                                            <div class="tab-pane" id="p3">
                                                <div class="col-md-2">
                                                    <br><br>
                                                    <button type="button" class="btn btn-primary">上传图片</button>
                                                    <br><br>
                                                    <button type="button" class="btn btn-primary">清空图片</button>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p4">
                                                <p>
                                                    第三部分内容.
                                                </p>
                                            </div>
                                            <div class="tab-pane" id="p5">
                                                <div class="col-md-2">
                                                    <br><br>
                                                    <button type="button" class="btn btn-primary">上传图片</button>
                                                    <br><br>
                                                    <button type="button" class="btn btn-primary">清空图片</button>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p6">
                                                <div class="row" style="margin-top: 20px">
                                                    <div class="col-md-4">
                                                        <div class='input-group date' id='datetimepicker3'>
                                                            <input type='text' class="form-control" />
                                                            <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-1" style="margin-top: 10px;text-align: center">至</div>
                                                    <div class="col-md-4">
                                                        <div class='input-group date' id='datetimepicker4'>
                                                            <input type='text' class="form-control" />
                                                            <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-1"></div>
                                                    <div class="col-md-2">
                                                        <button type="button" class="btn btn-primary">查询</button>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p7">
                                                <p>
                                                    第三部分内容.
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">待处理事项</h3>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>房源编号</th>
                                    <th>房间</th>
                                    <th>房屋地址</th>
                                    <th>待办事项</th>
                                    <th>事项时间</th>
                                    <th>处理</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>马潇峰</td>
                                    <td><button type="button" class="btn btn-primary">处理</button></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>陈开</td>
                                    <td><button type="button" class="btn btn-primary">处理</button></td>
                                    <td></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">已处理事项</h3>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>房源编号</th>
                                    <th>房间</th>
                                    <th>房屋地址</th>
                                    <th>待办事项</th>
                                    <th>事项时间</th>
                                    <th>处理人</th>
                                    <th>处理时间</th>
                                    <th>备注</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>马潇峰</td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>陈开</td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">我的审批</h3>
                        <div class="row">
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".m3">发起新审批</button>
                        </div>
                        <div class="row">
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>申请时间</th>
                                        <th>申请人</th>
                                        <th>分店</th>
                                        <th>部门</th>
                                        <th>职务</th>
                                        <th>申请项目</th>
                                        <th>申请金额</th>
                                        <th>申请事由</th>
                                        <th>状态</th>
                                        <th>处理人</th>
                                        <th>处理时间</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td><a href="####">修改</a></td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td><a href="####">修改</a></td>
                                        <td>马潇峰</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>二部</td>
                                        <td>陈开</td>
                                        <td><a href="####">修改</a></td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td><a href="####">修改</a></td>
                                        <td>马潇峰</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">待处理审批</h3>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>申请时间</th>
                                    <th>申请人</th>
                                    <th>分店</th>
                                    <th>部门</th>
                                    <th>职务</th>
                                    <th>申请项目</th>
                                    <th>申请金额</th>
                                    <th>申请事由</th>
                                    <th>处理</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>马潇峰</td>
                                    <td><a href="####">修改</a></td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td><button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m5">处理</button></td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>陈开</td>
                                    <td><a href="####">修改</a></td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td><button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m5">处理</button></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">已处理审批</h3>
                        <div class="row">
                            <div class="col-md-3" style="margin-left: -15px">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>申请时间</th>
                                        <th>申请人</th>
                                        <th>分店</th>
                                        <th>部门</th>
                                        <th>职务</th>
                                        <th>申请项目</th>
                                        <th>申请金额</th>
                                        <th>申请事由</th>
                                        <th>状态</th>
                                        <th>处理人</th>
                                        <th>处理时间</th>
                                        <th>查看</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td><a href="####">修改</a></td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td>查看</td>
                                        <td>马潇峰</td>
                                        <td><button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m4">查看</button></td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>二部</td>
                                        <td>陈开</td>
                                        <td><a href="####">修改</a></td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                        <td>马潇峰</td>
                                        <td>查看</td>
                                        <td>马潇峰</td>
                                        <td><button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m4">查看</button></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">报修管理</h3>
                        <div class="row" style="margin-top: 40px">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">未处理报修</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">已处理报修</button>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th>租客姓名</th>
                                <th>联系电话</th>
                                <th>报修时间</th>
                                <th>房屋地址</th>
                                <th>报修物品</th>
                                <th>故障描述</th>
                                <th>查看/处理</th>
                                <th>处理人</th>
                                <th>处理时间</th>
                                <th>结果备注</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>店长</td>
                                <td>雨花区</td>
                                <td>一部</td>
                                <td>马潇峰</td>
                                <td>没有</td>
                                <td><button type="button" class="btn btn-primary">查看</button></td>
                                <td>马潇峰</td>
                                <td>2019-1-16</td>
                                <td>没有</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>店长</td>
                                <td>雨花区</td>
                                <td>二部</td>
                                <td>陈开</td>
                                <td>没有</td>
                                <td><button type="button" class="btn btn-primary">查看</button></td>
                                <td>马潇峰</td>
                                <td>2019-1-16</td>
                                <td>没有</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">在线委托</h3>
                        <div class="row" style="margin-top: 40px">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">未处理委托</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">已处理委托</button>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>业主姓名</th>
                                    <th>联系电话</th>
                                    <th>具体房型</th>
                                    <th>房屋地址</th>
                                    <th>房屋面积</th>
                                    <th>可租年限</th>
                                    <th>查看/处理</th>
                                    <th>处理人</th>
                                    <th>处理时间</th>
                                    <th>结果备注</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>马潇峰</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>陈开</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">客户投诉</h3>
                        <div class="row" style="margin-top: 40px">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">未处理投诉</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">已处理投诉</button>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>租客姓名</th>
                                    <th>联系电话</th>
                                    <th>投诉时间</th>
                                    <th>房屋地址</th>
                                    <th>投诉内容</th>
                                    <th>查看/处理</th>
                                    <th>处理人</th>
                                    <th>处理时间</th>
                                    <th>结果备注</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="display: none">
                        <h3 style="text-align: center">预约看房</h3>
                        <div class="row" style="margin-top: 40px">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">未处理预约</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary">已处理预约</button>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="margin-top: 30px;text-align: center">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>客户姓名</th>
                                    <th>联系电话</th>
                                    <th>看房时间</th>
                                    <th>看房区域</th>
                                    <th>备注信息</th>
                                    <th>查看/处理</th>
                                    <th>处理人</th>
                                    <th>处理时间</th>
                                    <th>结果备注</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>一部</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>店长</td>
                                    <td>雨花区</td>
                                    <td>二部</td>
                                    <td>没有</td>
                                    <td><button type="button" class="btn btn-primary">查看</button></td>
                                    <td>马潇峰</td>
                                    <td>2019-1-16</td>
                                    <td>没有</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-8 col-lg-offset-2" style="">
                        <h3 style="text-align: center">财务管理</h3>
                        <div class="row">
                            <div class="col-md-4">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">分店：</span>
                                    <select class="selectpicker">
                                        <option value="1">雨花区</option>
                                        <option value="2">海淀区</option>
                                        <option value="3">金牛区</option>
                                        <option value="4">罗湖区</option>
                                    </select>
                                </span>

                            </div>
                            <div class="col-md-4">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">部门：</span>
                                    <select class="selectpicker">
                                        <option value="1">一部</option>
                                        <option value="2">二部</option>
                                        <option value="3">三部</option>
                                        <option value="4">四部</option>
                                        <option value="4">五部</option>
                                    </select>
                                </span>

                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>开始：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker7'>
                                        <input type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>截止：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker8'>
                                        <input type='text' class="form-control" />
                                        <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <button type="button" class="btn btn-primary" style="width: 100px;margin-top: 25px">统计</button>
                            </div>
                        </div>
                        <div class="row">
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>房源编号</th>
                                        <th>总收入</th>
                                        <th>总支出</th>
                                        <th>结余</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>一部</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>店长</td>
                                        <td>雨花区</td>
                                        <td>二部</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

        <div class="modal fade bs-example-modal-sm m1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加员工</h3>
                    <div class="modal-body" style="padding-left: 20%">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">内部编号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker">
                                <option value="1">雨花区</option>
                                <option value="2">海淀区</option>
                                <option value="3">金牛区</option>
                                <option value="4">罗湖区</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker">
                                <option value="1">一部</option>
                                <option value="2">二部</option>
                                <option value="3">三部</option>
                                <option value="4">四部</option>
                                <option value="5">五部</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker">
                                <option value="1">管理员</option>
                                <option value="2">店长</option>
                                <option value="3">财务</option>
                                <option value="4">经理</option>
                                <option value="5">文秘</option>
                                <option value="6">业务</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">员工姓名：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <div class="form-group">
                            <label>选择日期：</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id='datetimepicker1'>
                                <input type='text' class="form-control" />
                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                            </div>
                        </div>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录帐号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录密码：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">添加</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-example-modal-sm m2" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">修改员工信息</h3>
                    <div class="modal-body" style="padding-left: 20%">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">内部编号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker">
                                <option value="1">雨花区</option>
                                <option value="2">海淀区</option>
                                <option value="3">金牛区</option>
                                <option value="4">罗湖区</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker">
                                <option value="1">一部</option>
                                <option value="2">二部</option>
                                <option value="3">三部</option>
                                <option value="4">四部</option>
                                <option value="5">五部</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker">
                                <option value="1">管理员</option>
                                <option value="2">店长</option>
                                <option value="3">财务</option>
                                <option value="4">经理</option>
                                <option value="5">文秘</option>
                                <option value="6">业务</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">员工姓名：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <div class="form-group">
                            <label>入职时间：</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id='datetimepicker2'>
                                <input type='text' class="form-control" />
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </div>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录帐号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录密码：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">确认修改</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-example-modal-sm m3" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">发起新审批</h3>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>申请时间：</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id='datetimepicker5'>
                                <input type='text' class="form-control" />
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </div>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请人：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker">
                                <option value="1">雨花区</option>
                                <option value="2">海淀区</option>
                                <option value="3">金牛区</option>
                                <option value="4">罗湖区</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker">
                                <option value="1">一部</option>
                                <option value="2">二部</option>
                                <option value="3">三部</option>
                                <option value="4">四部</option>
                                <option value="5">五部</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker">
                                <option value="1">管理员</option>
                                <option value="2">店长</option>
                                <option value="3">财务</option>
                                <option value="4">经理</option>
                                <option value="5">文秘</option>
                                <option value="6">业务</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea name="" id="" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 150px;height: 150px;resize: none"></textarea>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">相关图片：</span>
                            <button type="button" class="btn btn-primary form-control" aria-describedby="sizing-addon3" style="width: 100px;">上传图片</button>
                        </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">提交审批</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-example-modal-sm m5" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理审批</h3>
                    <div class="modal-body">
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">申请时间：</span>
                            <select class="selectpicker myselect">
                                <option value="1">2019年1月23日</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请人：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker">
                                <option value="1">雨花区</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker">
                                <option value="1">一部</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker">
                                <option value="6">业务</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 150px;height: 150px;resize: none" onfocus="blur()"></textarea>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">相关图片：</span>
                        </span>
                    </div>
                    <div class="modal-footer">
                        <div class="row" style="text-align: center">
                            <div class="col-md-6">
                                <button type="button" class="btn btn-primary">通过</button>
                            </div>
                            <div class="col-md-6">
                                <button type="button" class="btn btn-danger">拒绝</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-example-modal-sm m4" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看审批</h3>
                    <div class="modal-body">
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">申请时间：</span>
                            <select class="selectpicker myselect">
                                <option value="1">2019年1月23日</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请人：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker">
                                <option value="1">雨花区</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker">
                                <option value="1">一部</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker">
                                <option value="6">业务</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 150px;height: 150px;resize: none"></textarea>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">相关图片：</span>
                        </span>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <!-- /#wrapper -->


	<script type="text/javascript">
		$(document).ready(function () {
		  var trigger = $('.hamburger'),
		      overlay = $('.overlay'),
		     isClosed = false;

		    trigger.click(function () {
		      hamburger_cross();      
		    });

		    function hamburger_cross() {

		      if (isClosed == true) {          
		        overlay.hide();
		        trigger.removeClass('is-open');
		        trigger.addClass('is-closed');
		        isClosed = false;
		      } else {   
		        overlay.show();
		        trigger.removeClass('is-closed');
		        trigger.addClass('is-open');
		        isClosed = true;
		      }
		  }

		  $('[data-toggle="offcanvas"]').click(function () {
		        $('#wrapper').toggleClass('toggled');
		  });
            $(".selectpicker").selectpicker({
                width:100
            });
            $('#myModal').on('shown.bs.modal', function () {
                $('#myInput').focus()
            })
                $('#datetimepicker1').datetimepicker({
                    format: 'YYYY-MM-DD',
                    locale: moment.locale('zh-cn')
                });
            $('#datetimepicker2').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker3').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker4').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker5').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker6').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker7').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $('#datetimepicker8').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
		});
	</script>
</body>
</html>