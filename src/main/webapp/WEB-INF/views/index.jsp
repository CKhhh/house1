<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.house.Bean.Employee" %>
<!DOCTYPE html>
<html lang="zh" style="background: rgba(222,222,222,.3)">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>壹叁玖地产</title>
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
    <script type="text/javascript" src="../../static/js/jquery.contextmenu.r2.js"></script>
    <script type="text/javascript" src="../../static/js/index.js"></script>
	<link rel="stylesheet" href="../../static/css/style.css">

</head>
<body style="background: rgba(222,222,222,.0)">
    <%Employee employee = (Employee)session.getAttribute("employee");
    if(employee!=null){%>

	<div id="wrapper">
        <%--<div class="overlay"></div>--%>
    
        <!-- Sidebar -->
        <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
            <ul class="nav sidebar-nav">
                <li class="sidebar-brand">
                    <a href="####">
                       壹叁玖地产
                    </a>
                </li>
                <li id="fangyuan" onclick="selectAllListing(1);">
                    <a href="####"><i class="glyphicon glyphicon-home"></i> 房源管理</a>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-star"></i> 待办事项 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li onclick="selectUnDeal();" id="unthings"><a href="####">待处理事项</a></li>
                        <li onclick="selectDeal();" id="donethings"><a href="####">已处理事项</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-tags"></i> 审批管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li id="myapproval" onclick="selectOwnApplication1();"><a href="####">我的审批</a></li>
                        <li id="unapproval"><a href="####">待处理审批</a></li>
                        <li id="doneapproval"><a href="####">已处理审批</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="####" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-flag"></i> 客户服务 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li class="dropdown-header">Dropdown heading</li>
                        <li id="fixmanage"><a href="####">报修管理</a></li>
                        <li id="entrust"><a href="####">在线委托</a></li>
                        <li id="complaint"><a href="####">客户投诉</a></li>
                        <li id="watchhouse"><a href="####">预约看房</a></li>
                    </ul>
                </li>
                <li id="money">
                    <a href="####"><i class="glyphicon glyphicon-yen"></i> 财务管理</a>
                </li>
                <li id="staff">
                    <a href="####"><i class="glyphicon glyphicon-user"></i> 员工管理</a>
                </li>
                <li onclick="outLogin();">
                    <a href="####"><i class="glyphicon glyphicon-log-out"></i> 注销</a>
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
                <div class="contextMenu" id="myMenu1">
                    <ul>
                        <li id="youjian_xiugaifangyuan"> 修改</li>
                        <li id="youjian_tianjiafangyuan"> 添加</li>
                    </ul>
                </div>
                <div class="contextMenu" id="myMenu2">
                    <ul>
                        <li id="youjian_xiugaifangjian"> 修改</li>
                        <li id="youjian_tianjiafangjian"> 添加</li>
                    </ul>
                </div>
                <div class="contextMenu" id="myMenu3">
                    <ul>
                        <li id="youjian_tianjiafangjian1"> 添加</li>
                    </ul>
                </div>
                <div class="contextMenu" id="myMenu4">
                    <ul>
                        <li id="youjian_tianjiashouru"> 添加</li>
                    </ul>
                </div>
                <div class="contextMenu" id="myMenu5">
                    <ul>
                        <li id="youjian_tianjiazhichu"> 添加</li>
                    </ul>
                </div>
                <div class="row" style="margin-bottom: 20px">
                    <div class="col-md-1 nav_on" style="display: block">
                        <div class="nav_btn" style="background-color: white;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            房源管理
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            待处理事项
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            已处理事项
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            我的审批
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            待处理审批
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            已处理审批
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            报修管理
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            在线委托
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            客户投诉
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            预约看房
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            财务管理
                        </div>
                    </div>
                    <div class="col-md-1 nav_on" style="display: none">
                        <div class="nav_btn" style="background-color: lightslategray;border-radius: 5%;padding: 5px;cursor: pointer">
                            <button type="button" class="close my_close" title="关闭">
                                &times;
                            </button>
                            员工管理
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div id="listing" class="col-lg-8 col-lg-offset-2 ddd" style="">
                        <div class="row" style="margin-left: 0px;background: rgba(255,255,255,.9);width: 100%;padding-top: 10px;padding-bottom: 10px;box-shadow: 2px 2px 2px #888888;border-radius: 5px">
                            <div class="col-md-3">
                                <div class="input-group" style="margin-left: 10px">
                                    <input id="ssfy" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button onclick="sousuofangyuan(1);" class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                            <div class="col-md-7"></div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" id="shaixuanfangyuan" onclick="shaixuan_fun(1)">筛选房源</button>
                            </div>
                        </div>
                        <div id="shaixuanjiemian" style="padding-left: 20px;display: none;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 2px 2px 2px #888888;border-radius: 5px">
                            <div class="row" style="margin-top: 20px;">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">分店：</span>
                                        <select id="branch" onchange="liandongBranch(this);" class="selectpicker">
                                            <option value="55">请选择分店</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">部门：</span>
                                        <select id="depa1" class="selectpicker">
                                            <option value="0">请选择部门</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon" >区域：</span>
                                        <select id="area" onchange="liandongArea(this);" class="selectpicker">
                                            <option value="0">请选择区域</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">小区：</span>
                                    <select id="comm1" class="selectpicker">
                                        <option value="0">请选择小区</option>
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">类型：</span>
                                    <select id="lx" class="selectpicker">
                                        <option value="0">请选择类型</option>
                                        <option value="1">整租</option>
                                        <option value="2">合租</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span  class="input-group-addon">户型：</span>
                                    <select id="hx" class="selectpicker">
                                        <option value="0">请选择户型</option>
                                        <option value="1">单室套</option>
                                        <option value="2">两室一厅</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房间状态：</span>
                                    <select id="fzzt" class="selectpicker">
                                        <option value="0">请选择房间状态</option>
                                        <option value="1">已租</option>
                                        <option value="2">未租</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                    <button type="button" onclick="quedingshaixuan(1);" class="btn btn-primary" style="margin-top: 5px">确定筛选</button>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="padding-left: 20px;padding-right:20px;margin-top: 30px;text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;box-shadow: 2px 2px 2px #888888;border-radius: 5px">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>房源编号</th>
                                    <th>分店</th>
                                    <th>部门</th>
                                    <th>区域</th>
                                    <th>房屋地址</th>
                                    <th>户型</th>
                                    <th>类型</th>
                                    <th>面积</th>
                                    <th>定价</th>
                                    <th>状态</th>
                                    <th>房管</th>
                                    <th>文秘</th>
                                    <th>截至日期</th>
                                    <th>房源备注</th>
                                </tr>
                                </thead>
                                <tbody id="listing-tbody" name="allListing">

                                </tbody>
                            </table>
                            <ul class="pager" id="listing_paper">
                                <li onclick="fangyuanshangyiye();" class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li onclick="fangyuanxiayiye();" class="paper_down"><a href="####">下一页</a></li>
                            </ul>

                        </div>
                        <div class="table-responsive" style="padding-left: 20px;padding-right:20px;margin-top: 30px;text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;;box-shadow: 2px 2px 2px #888888;border-radius: 5px">
                            <table class="table table-bordered" id="room_table">
                                <thead id="room_table_head">
                                <tr>
                                    <th>房源编号</th>
                                    <th>房间编号</th>
                                    <th>状态</th>
                                    <th>状态日期</th>
                                    <th>独卫</th>
                                    <th>阳台</th>
                                    <th>朝向</th>
                                    <th>定价</th>
                                    <th>房间备注</th>
                                </tr>
                                </thead>
                                <tbody id="room-tbody">

                                </tbody>
                            </table>
                            <ul class="pager" id="room_paper">
                                <li onclick="fangjianshangyiye();" class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li onclick="fangjianxiayiye();" class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>

                        <div class="container-fluid" style="margin-left: -15px;margin-top: 30px;">
                            <div class="row-fluid">
                                <div class="span12">
                                    <div class="tabbable" style="width: 102%;padding-left: 20px;padding-right: 10px;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 2px 2px 2px #888888;border-radius: 5px" id="tabs-967793">
                                        <ul class="nav nav-tabs">
                                            <li class="active">
                                                <a href="#p1" data-toggle="tab">房源照片</a>
                                            </li>
                                            <li onclick="fangyuandianji()">
                                                <a href="#p2" data-toggle="tab">房源信息</a>
                                            </li>
                                            <li onclick="yezhuziliaodianji()">
                                                <a href="#p3" data-toggle="tab">业主资料</a>
                                            </li>
                                            <li onclick="fangjiandianji()">
                                                <a href="#p4" data-toggle="tab">房间信息</a>
                                            </li>
                                            <li onclick="zukeziliaodianji()">
                                                <a href="#p5" data-toggle="tab">租客资料</a>
                                            </li>
                                            <li onclick="shouzhimingxidianji()">
                                                <a href="#p6" data-toggle="tab">收支明细</a>
                                            </li>
                                            <li onclick="yejidianji()">
                                                <a href="#p7" data-toggle="tab">业绩记录</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="p1">
                                                <div class="col-md-2"></div>
                                                <div class="col-md-6" style="margin-top: 50px;">
                                                    <div id="myCarousel" class="carousel slide" style="width:100%;">
                                                        <!-- 轮播（Carousel）指标 -->
                                                        <ol class="carousel-indicators" id="fangyuantupianol">
                                                        </ol>
                                                        <!-- 轮播（Carousel）项目 -->
                                                        <div class="carousel-inner" id="fangyuantupian">

                                                        </div>
                                                        <!-- 轮播（Carousel）导航 -->
                                                        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                                            <span class="sr-only">Previous</span>
                                                        </a>
                                                        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                                            <span class="sr-only">Next</span>
                                                        </a>
                                                    </div>
                                                </div>
                                                <div class="col-md-2"></div>
                                            </div>
                                            <div class="tab-pane" id="p2">
                                                <div id="p2_2" style="display: none">
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">房源编号：</span>
                                                        <input  id="listingIdl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">合同编号：</span>
                                                        <input id="constractIdl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">分店：</span>
                                                        <input id="branchl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">部门：</span>
                                                        <input id="departmentl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">区域：</span>
                                                        <input id="areal-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                    <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                        <span class="input-group-addon">小区：</span>
                                                        <input id="communityl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                    </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">房管：</span>
                                                            <input id="houseManagel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">文秘：</span>
                                                            <input id="secretariall-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-6">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                            <span class="input-group-addon">房屋地址：</span>
                                                            <input id="addressl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">楼层：</span>
                                                            <input id="floorl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">电梯：</span>
                                                            <input id="elevatorl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">面积：</span>
                                                            <input id="acreagel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-6">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                            <span class="input-group-addon">免租信息：</span>
                                                            <input id="freeRentMsgl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">类型：</span>
                                                            <input id="borrowTypel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">户型：</span>
                                                            <input id="houseTypel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            起租日：
                                                            <div class='input-group date' id='datetimepicker9'>
                                                                <input onfocus="blur()" id="startTimel-2" type='text' class="form-control" />
                                                                <span class="input-group-addon" onfocus="blur()">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-3">
                                                            截止日：
                                                            <div class='input-group date' id='datetimepicker10'>
                                                                <input onfocus="blur()" id="endTimel-2" type='text' class="form-control" />
                                                                <span class="input-group-addon" onfocus="blur()">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                            </div>
                                                        </div>

                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">收房价格：</span>
                                                            <input id="housePricel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">押金：</span>
                                                            <input id="depositl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">业主姓名：</span>
                                                            <input id="ownerNamel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">电话：</span>
                                                            <input id="ownerPhonel-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 20px;margin-left: -15px">
                                                            <span class="input-group-addon">身份证：</span>
                                                            <input id="ownerCardl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                        </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                                <span class="input-group-addon">收款信息：</span>
                                                                <input id="paymentMsgl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                                <span class="input-group-addon">水费卡号：</span>
                                                                <input id="waterCardl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleWaterl1-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleWaterl2-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <div style="margin-top: 20px;">
                                                                <input id="waterDayl-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="width: 40%;display: inline">
                                                                <span>日缴纳</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                                <span class="input-group-addon">电费卡号：</span>
                                                                <input id="electricityCardl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleElectricityl1-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleElectricityl2-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <div style="margin-top: 20px;">
                                                                <input id="electricityDayl-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="width: 40%;display: inline">
                                                                <span>日缴纳</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 20px;">
                                                                <span class="input-group-addon">燃气卡号：</span>
                                                                <input id="gasCardl-2" type="text" class="form-control" aria-describedby="sizing-addon3"onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleGasl1-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <input id="paymentCycleGasl2-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="margin-top: 20px;width: 80%;display: inline">
                                                        </div>
                                                        <div class="col-md-2">
                                                            <div style="margin-top: 20px;">
                                                                <input id="gasDayl-2" type="text" class="form-control"aria-describedby="sizing-addon3"onfocus="blur()" style="width: 40%;display: inline">
                                                                <span>日缴纳</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <label>交接底数：</label>
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                                                <span class="input-group-addon">水：</span>
                                                                <input id="tBWl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                                                <span class="input-group-addon">气：</span>
                                                                <input id="tBGl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>

                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                                                <span class="input-group-addon">电总：</span>
                                                                <input id="tBEl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                                                <span class="input-group-addon">电峰：</span>
                                                                <input id="tBEHl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                                                <span class="input-group-addon">电谷：</span>
                                                                <input id="tBEHLl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">付款方式：</span>
                                                                <input id="paymentStyle1l-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 80%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-1"></div>
                                                        <div class="col-md-3">
                                                            <button type="button" class="btn btn-primary btn-block" style="margin-top: 10px" onclick="findlistingPlan()" data-toggle="modal" data-target=".m24">点击查看详细付款计划</button>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-9">
                                                            <div>
                                                                <label>房间配置</label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="aa" value="1"> wifi
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="bb" value="2"> 热水器
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="cc" value="3"> 洗衣机
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="dd" value="4"> 冰箱
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="ee" value="5"> 燃气灶
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="ff" value="6"> 油烟机
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="gg" value="7"> 电视
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="hh" value="8"> 沙发
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="ii" value="9"> 微波炉
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">财务备注：</span>
                                                                <textarea name="" id="financeNotel-2" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">房源备注：</span>
                                                                <textarea name="" id="houseNotel-2" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">合同备注：</span>
                                                                <textarea name="" id="contractNotel-2" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row" style="margin-bottom: 15px">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">房源描述：</span>
                                                                <textarea name="" id="listingDesclrl-2" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <input id="listingKuandail-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <input id="listingKuandaiidl-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-4">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">到期日：</span>
                                                                <input id="listingKuandairiqil-2" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p3">
                                                <div id="p3_3" style="display: none">
                                                    <div class="col-md-2"></div>
                                                    <div class="col-md-6" style="margin-top: 50px;">
                                                        <div id="myCarouse2" class="carousel slide" style="width:100%;">
                                                            <!-- 轮播（Carousel）指标 -->
                                                            <ol class="carousel-indicators" id="yzzlol">
                                                            </ol>
                                                            <!-- 轮播（Carousel）项目 -->
                                                            <div class="carousel-inner" id="yzzl">

                                                            </div>
                                                            <!-- 轮播（Carousel）导航 -->
                                                            <a class="left carousel-control" href="#myCarouse2" role="button" data-slide="prev">
                                                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                                                <span class="sr-only">Previous</span>
                                                            </a>
                                                            <a class="right carousel-control" href="#myCarouse2" role="button" data-slide="next">
                                                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                                                <span class="sr-only">Next</span>
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-2"></div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p4">
                                                <div id="p4_4" style="display:none;">
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">房间编号：</span>
                                                                <input id="room_id" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">当前状态：</span>
                                                                <input id="room_dangqianzhuangtai" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">状态日期：</span>
                                                                <input id="room_zhuangtairiqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">合同编号：</span>
                                                                <input id="room_hetongbianhao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">定价：</span>
                                                                <input id="room_dingjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">签单业务：</span>
                                                                <input id="room_qiandanyewu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">出房价：</span>
                                                                <input id="room_chufangjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">押金：</span>
                                                                <input id="room_yajin" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">服务费：</span>
                                                                <input id="room_fuwufei" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">付款方式：</span>
                                                                <input id="room_fukuanfangshi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">租客姓名：</span>
                                                                <input id="room_zukexingming" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">租客电话：</span>
                                                                <input id="room_zukedianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">朝向：</span>
                                                                <input id="room_face" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                    </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">身份证号：</span>
                                                                <input id="room_shenfenzhenghao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">合同状态：</span>
                                                                <input id="room_hetongzhuangtai" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">面积：</span>
                                                                <input id="room_mianji" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 80%;">㎡
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                        <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">起租日期：</span>
                                                                <input id="room_qizuriqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">截止日期：</span>
                                                                <input id="room_jiezhiriqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-2">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">欠款：</span>
                                                                <input id="room_qiankuan" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 80%;">
                                                                元
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">最迟还款日：</span>
                                                                <input id="room_zuichihuankuanri" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">性别：</span>
                                                                <input id="room_xingbie" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 90%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">水表：</span>
                                                                <input id="room_shuibiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">燃气：</span>
                                                                <input id="room_ranqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">电总：</span>
                                                                <input id="room_dianzong" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">电峰：</span>
                                                                <input id="room_dianfeng" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">电谷：</span>
                                                                <input id="room_diangu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">独立电表：</span>
                                                                <input id="room_dulidianbiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-3">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">紧急联系人姓名：</span>
                                                                <input id="room_jinjilianxirenxingming" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-5">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">紧急联系人电话：</span>
                                                                <input id="room_jinjilianxirendianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100%;">
                                                            </span>
                                                        </div>
                                                        <div class="col-md-3">
                                                            <button type="button" class="btn btn-primary" style="margin-top: 10px;" onclick="findroomPlan()" data-toggle="modal" data-target=".m25">点击查看详细付款计划</button>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div style="margin-top: 10px">
                                                                <label>房间配置</label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox1_3" value="3"> 独卫
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox2_3" value="4"> 阳台
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox3_3" value="5"> 空调
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox4_3" value="6"> 床
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox5_3" value="1"> 书桌
                                                                </label>
                                                                <label class="checkbox-inline">
                                                                    <input disabled="true" type="checkbox" id="inlineCheckbox6_3" value="2"> 衣柜
                                                                </label>
                                                            </div>
                                                        </div>

                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">财务备注：</span>
                                                                <textarea name="" id="room_caiwubeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">合同备注：</span>
                                                                <textarea name="" id="room_hetongbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="row" style="margin-bottom: 20px">
                                                        <div class="col-md-6">
                                                            <span class="input-group input-group-sm" style="margin-top: 10px;">
                                                                <span class="input-group-addon">房间备注：</span>
                                                                <textarea name="" id="room_fangjianbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none" onfocus="blur()"></textarea>
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p5">
                                                <div id="p5_5" style="display:none">
                                                    <div class="col-md-2"></div>
                                                    <div class="col-md-6" style="margin-top: 50px;">
                                                        <div id="myCarouse3" class="carousel slide" style="width:100%;">
                                                            <!-- 轮播（Carousel）指标 -->
                                                            <ol class="carousel-indicators" id="zkzlol">
                                                            </ol>
                                                            <!-- 轮播（Carousel）项目 -->
                                                            <div class="carousel-inner" id="zkzl">

                                                            </div>
                                                            <!-- 轮播（Carousel）导航 -->
                                                            <a class="left carousel-control" href="#myCarouse3" role="button" data-slide="prev">
                                                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                                                <span class="sr-only">Previous</span>
                                                            </a>
                                                            <a class="right carousel-control" href="#myCarouse3" role="button" data-slide="next">
                                                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                                                <span class="sr-only">Next</span>
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-2"></div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p6">
                                                <div id="p6_6" style="display: none">
                                                    <div class="row" style="margin-top: 20px;">
                                                        <div class="col-md-4">
                                                            <div class='input-group date' id='datetimepicker3'>
                                                                <input id="shouzhi_start" type='text' class="form-control" />
                                                                <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-1" style="margin-top: 10px;text-align: center">至</div>
                                                        <div class="col-md-4">
                                                            <div class='input-group date' id='datetimepicker4'>
                                                                <input id="shouzhi_end" type='text' class="form-control" />
                                                                <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-1"></div>
                                                        <div class="col-md-2">
                                                            <button type="button" class="btn btn-primary" onclick="shouzhichaxun(1,1)">查询</button>
                                                        </div>
                                                    </div>
                                                    <div class="row" style="margin-top: 20px">
                                                        <div class="col-md-6">
                                                            <h4>收入明细</h4>
                                                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                                                <table class="table table-bordered" id="shouru_table">
                                                                    <thead>
                                                                    <tr>
                                                                        <th>录入时间</th>
                                                                        <th>金额</th>
                                                                        <th>事项</th>
                                                                        <th>录入员</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody id="shouru-tbody">

                                                                    </tbody>
                                                                </table>
                                                                <ul class="pager" id="shouru_paper">
                                                                    <li class="paper_up" onclick="shouru_up()"><a href="####">上一页</a></li>
                                                                    <i></i>
                                                                    <li class="paper_down" onclick="shouru_down()"><a href="####">下一页</a></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h4>支出明细</h4>
                                                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                                                <table class="table table-bordered" id="zhichu_table">
                                                                    <thead>
                                                                    <tr>
                                                                        <th>录入时间</th>
                                                                        <th>金额</th>
                                                                        <th>事项</th>
                                                                        <th>录入员</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody id="zhichu-tbody">

                                                                    </tbody>
                                                                </table>
                                                                <ul class="pager" id="zhichu_paper">
                                                                    <li class="paper_up" onclick="zhichu_up()"><a href="####">上一页</a></li>
                                                                    <i></i>
                                                                    <li class="paper_down" onclick="zhichu_down()"><a href="####">下一页</a></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="p7">
                                                <div id="p7_7" style="display: none">
                                                    <div class="table-responsive" style="padding-left: 20px;padding-right:20px;margin-top: 30px;text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;;box-shadow: 2px 2px 2px #888888;border-radius: 5px">
                                                        <table class="table table-bordered" id="yeji_table">
                                                            <thead id="yeji_table_head">
                                                            <tr>
                                                                <th>录入时间</th>
                                                                <th>记录详情</th>
                                                                <th>录入员</th>
                                                            </tr>
                                                            </thead>
                                                            <tbody id="yeji-tbody">
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="undeal" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3  style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">待处理事项</h3>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
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
                                <tbody id="daiban-tbody">

                                </tbody>
                            </table>
                            <ul class="pager" id="daichulishixiang_paper">
                                <li onclick="undealshangyiye();" class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li onclick="undealxiayiye();" class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="dealed" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">已处理事项</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <input id="sousuoyichuli" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button onclick="selectBlurry()" class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
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
                                <tbody id="yiban-tbody" name="all">

                                </tbody>
                            </table>
                            <ul class="pager" id="yichulishixiang_paper">
                                <li onclick="dealshangyiye();" class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li onclick="dealxiayiye();" class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="myapplication" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">我的审批</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".m3">发起新审批</button>
                        </div>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
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
                                    <tbody id="ownApplication">
                                    </tbody>
                                </table>
                                <ul class="pager" id="myapplication_paper">
                                    <li class="paper_up"><a href="####">上一页</a></li>
                                    <i></i>
                                    <li class="paper_down"><a href="####">下一页</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div id="unapplication" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">待处理审批</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table id="unapplication_table" class="table table-bordered">
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
                                    </tbody>
                                </table>
                                <ul class="pager" id="unapplication_paper">
                                    <li class="paper_up"><a href="####">上一页</a></li>
                                    <i></i>
                                    <li class="paper_down"><a href="####">下一页</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div id="applicationed" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">已处理审批</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-3" style="margin-left: -15px">
                                <div class="input-group">
                                    <input type="text" class="form-control" id="donapp_searchInfo">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button" onclick="doneApplication_search1()">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table name="doneapplication" id="doneapplication_table" class="table table-bordered">
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
                                    </tbody>
                                </table>
                                <ul class="pager" id="doneapplication_paper">
                                    <li class="paper_up"><a href="####">上一页</a></li>
                                    <i></i>
                                    <li class="paper_down"><a href="####">下一页</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div id="repair" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">报修管理</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 40px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-2">
                                <button type="button" onclick="repair1_1()" class="btn btn-primary">未处理报修</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" onclick="repair2_2()" class="btn btn-success">已处理报修</button>
                            </div>
                            <div class="col-md-3 col-md-offset-5">
                                <div class="input-group">
                                    <input id="repairfind" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button onclick="repair3_3();" class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <table name="repairUn" class="table table-bordered" id="repair_table">
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
                                <tbody id="repair-tbody">
                                </tbody>
                            </table>
                            <ul class="pager" id="repair_paper">
                                <li class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="onlinecommunicate" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">在线委托</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 40px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-2">
                                <button onclick="online1_1()" type="button" class="btn btn-primary">未处理委托</button>
                            </div>
                            <div class="col-md-2">
                                <button onclick="online2_2()" type="button" class="btn btn-success">已处理委托</button>
                            </div>
                            <div class="col-md-3 col-md-offset-5">
                                <div class="input-group">
                                    <input id="onlinefind" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button onclick="online3_3()" class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <table name="onlineUn" id="online_table" class="table table-bordered">
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
                                </tbody>
                            </table>
                            <ul class="pager" id="online_paper">
                                <li class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="customcomplaint" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">客户投诉</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 40px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-2">
                                <button onclick="complaint1_1()" type="button" class="btn btn-primary">未处理投诉</button>
                            </div>
                            <div class="col-md-2">
                                <button onclick="complaint2_2()" type="button" class="btn btn-success">已处理投诉</button>
                            </div>
                            <div class="col-md-3 col-md-offset-5">
                                <div class="input-group">
                                    <input id="complaintfind" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button onclick="complaint3_3()" class="btn btn-default" type="button">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <table name="complaintUn" id="complaint_table" class="table table-bordered">
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
                                </tbody>
                            </table>
                            <ul class="pager" id="complaint_paper">
                                <li class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="reservation" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">预约看房</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 40px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" onclick="reservation1_1();">未处理预约</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-success" onclick="reservation2_2();">已处理预约</button>
                            </div>
                            <div class="col-md-3 col-md-offset-5">
                                <div class="input-group">
                                    <input id="reservationfind" type="text" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button" onclick="reservation3_3()">搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive" style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 30px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <table name="reservationUn" id="reservation_table" class="table table-bordered">
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
                                </tbody>
                            </table>
                            <ul class="pager" id="reservation_paper">
                                <li class="paper_up"><a href="####">上一页</a></li>
                                <i></i>
                                <li class="paper_down"><a href="####">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="finance" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">财务管理</h3>
                        <h3 id="finance_tip" style="text-align: center;margin-top: 100px;display: none;">对不起！您没有权限查看此内容！</h3>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-4">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">分店：</span>
                                    <select id="financeBranch" onchange="liandongBranch7(this);" class="selectpicker">
                                    </select>
                                </span>

                            </div>
                            <div class="col-md-4">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">部门：</span>
                                    <select id="financeDepa" class="selectpicker">
                                    </select>
                                </span>

                            </div>

                        </div>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>开始：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker7'>
                                        <input id="finance_start" type='text' class="form-control" />
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
                                        <input id="finance_end" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <button type="button" onclick="finance_tongji()" class="btn btn-primary" style="width: 100px;margin-top: 25px">统计</button>
                            </div>
                        </div>
                        <div class="row" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
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
                                    <tbody id="finance-tbody">
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="row">
                            列表内总计收入：
                            <i id="zongshouru">0</i>
                            元，总计支出
                            <i id="zongzhichu">0</i>
                            元，总结余
                            <i id="zongjieyu">0</i>
                            元
                        </div>
                    </div>
                    <div id="employee" class="col-lg-8 col-lg-offset-2 ddd" style="display: none">
                        <h3 style="text-align: center;background-color: rgba(255,255,255,.9);margin-bottom: 20px;padding-top: 10px;padding-bottom: 10px;box-shadow: 3px 3px 3px #888888;border-radius: 5px; border: 1px black;">员工管理</h3>
                        <div class="container-fluid" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;box-shadow: 3px 3px 3px #888888;border-radius: 5px" border: 1px black;>
                            <p>我的信息</p>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">编号：</span>
                                        <input type="text" id="yuangong_id" class="form-control" value="${employee.empId}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 100px;" >
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">分店：</span>
                                        <select class="selectpicker" id="yuangong_fendian">
                                            <option value="1">${employee.empBranch}</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">部门：</span>
                                        <select class="selectpicker" id="yuangong_bumen">
                                            <option value="1">${employee.empPart}</option>
                                        </select>
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">职务：</span>
                                        <select class="selectpicker" id="yuangong_zhiwu">
                                            <option value="1">${employee.empJob}</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">姓名：</span>
                                        <input type="text" id="yuangong_name" class="form-control" value="${employee.empName}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 100px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">电话：</span>
                                        <input type="text" id="yuangong_tel" class="form-control" value="${employee.empPhone}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">入职时间：</span>
                                        <input type="text" id="yuangong_ruzhitime" class="form-control" value="${employee.empEntry}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">登录帐号：</span>
                                        <input type="text" id="yuangong_account" class="form-control" value="${employee.empUname}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                                <div class="col-md-4">
                                    <span class="input-group input-group-sm" style="margin-top: 5px">
                                        <span class="input-group-addon">登录密码：</span>
                                        <input type="text" id="yuangong_password" class="form-control" value="${employee.empPassword}" aria-describedby="sizing-addon3" onfocus=this.blur() style="width: 150px;">
                                    </span>
                                </div>
                            </div>
                            <button type="button" class="btn btn-primary"  data-toggle="modal" data-target=".m2" style="margin-top: 5px">修改信息</button>
                        </div >
                        <div id="option_employee" style="background: rgba(255,255,255,.9);padding-top: 10px;padding-bottom: 10px;margin-top: 20px;box-shadow: 3px 3px 3px #888888;border-radius: 5px">
                            <div id class="container-fluid" style="margin-top: 50px">
                                <div class="col-md-2" id="add_newEmployee">
                                    <button onclick="tianjiayuangong();" type="button" class="btn btn-warning" data-toggle="modal" data-target=".m1" style="margin-left: -15px">添加新员工</button>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">分店：</span>
                                        <select onchange="liandongBranch4(this)" class="selectpicker" id="search_yuangong_fendian">
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">部门：</span>
                                        <select class="selectpicker" id="search_yuangong_bumen">
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-2">
                                    <span class="input-group input-group-sm">
                                        <span class="input-group-addon">姓名：</span>
                                        <input type="text" id="search_yuangong_name" class="form-control" aria-describedby="sizing-addon3" style="width: 80px;" value="">
                                    </span>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" id="search_yuangong_btn" class="btn btn-success btn-block">搜索</button>
                                </div>
                            </div>
                            <div class="table-responsive" style="margin-top: 30px;text-align: center">
                                <table name="yuangongAll" class="table table-striped" id="yuangong_table">
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
                                    </tbody>
                                </table>
                                <ul class="pager" id="yuangong_paper">
                                    <li class="paper_up"><a href="####">上一页</a></li>
                                    <i></i>
                                    <li class="paper_down"><a href="####">下一页</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

        <div name="tianjiayuangong" class="modal fade bs-example-modal-sm m1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h3 class="modal-header" style="text-align: center">添加员工</h3>
                        <div class="modal-body" style="padding-left: 20%">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">内部编号：</span>
                            <input type="text" id="add_id" value="自动编号" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select onchange="liandongBranch5(this);" class="selectpicker" id="add_fendian">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker" id="add_bumen">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker" id="add_zhiwu" onclick="tianjiadianzhang(this)">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">员工姓名：</span>
                            <input type="text" id="add_name" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="add_tel" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <div class="form-group">
                                <label>选择日期：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='datetimepicker1'>
                                    <input type='text' id="add_entry" class="form-control" />
                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                </div>
                            </div>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录帐号：</span>
                            <input type="text" id="add_account" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录密码：</span>
                            <input type="text" id="add_password" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        </div>
                        <div class="modal-footer">
                            <button type="button" id="addyuangong" class="btn btn-primary" data-dismiss="modal">添加</button>
                        </div>
                    </div>
                </div>
            </div>
        <div name="xiugaiziji" class="modal fade bs-example-modal-sm m2" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">修改员工信息</h3>
                    <div class="modal-body" style="padding-left: 20%">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">内部编号：</span>
                            <input type="text" id="change_id" class="form-control" value="${employee.empId}" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select class="selectpicker" id="change_fendian">
                                <option value="1">${employee.empBranch}</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker" id="change_bumen">
                                <option value="1">${employee.empPart}</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker" id="change_zhiwu">
                                <option value="1">${employee.empJob}</option>
                            </select>
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">员工姓名：</span>
                            <input type="text" id="change_name" class="form-control" value="${employee.empName}" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="change_tel" class="form-control" value="${employee.empPhone}" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <div class="form-group">
                            <label>入职时间：</label>
                            <input type='text' id="change_entry" value="${employee.empEntry}" class="form-control" onfocus="blur()"/>
                            <!--指定 date标记-->
                         <%--   <div class='input-group date' id='datetimepicker2'>

&lt;%&ndash;                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>&ndash;%&gt;
                            </div>--%>
                        </div>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录帐号：</span>
                            <input type="text" id="change_account" class="form-control" value="${employee.empUname}" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录密码：</span>
                            <input type="text" id="change_password" class="form-control" value="${employee.empPassword}" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" id="changeyuangong" class="btn btn-primary" data-dismiss="modal">确认修改</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="faqishenpi" class="modal fade bs-example-modal-sm m3" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">发起新审批</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input id="applicationPrice" type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 90%;">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" id="applicationBankCard" class="form-control" aria-describedby="sizing-addon3" style="width: 90%;">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" id="applicationPro" class="form-control" aria-describedby="sizing-addon3" style="width: 90%;">
                        </span>

                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea name="" id="applicationReason" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 150px;resize: none"></textarea>
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">相关图片：</span>
                            <span style="width: 200px">
                                <input type="file" onchange="yulanfaqishenpitupian();" id="applicationImgs" style="display: none" multiple>
                                <button type="button" class="btn btn-primary form-control" aria-describedby="sizing-addon3"
                                        onclick="insertApplicationImgs();" style="width: 100px;">上传图片</button>
                            </span>
                        </span>
                            </div>
                        </div>
                        <div id="faqishenpitupian" class="row">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="insertApplication();" class="btn btn-primary" data-dismiss="modal">提交审批</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chulishenpi" class="modal fade bs-example-modal-sm m5" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理审批</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">申请时间：</span>
                            <input type="text" id="unapp_time" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请人：</span>
                            <input type="text" id="unapp_person" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <input type="text" id="unapp_fendian" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <input type="text" id="unapp_bumen" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <input type="text" id="unapp_zhiwu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input type="text" id="unapp_money" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" id="unapp_xiangmu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" id="unapp_bankcard" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea id="unapp_reason" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 150px;resize: none" onfocus="blur()"></textarea>
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span id="unapp_pic" class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">相关图片：</span>
                            <span style="width: 200px">
                                <input type="file" id="insertUnApplication" style="display: none" multiple>
                                <button type="button" class="btn btn-primary form-control" aria-describedby="sizing-addon3"
                                        onclick="insertUnApplicationImgs();" style="width: 100px;">上传图片</button>
                            </span>
                        </span>
                            </div>
                        </div>
                        <div id="chulishenpitupian" class="row">
                        </div>
                        <span id='unapp_personid' style='display: none'></span>
                        <span id='unapp_appid' style='display: none'></span>
                    </div>
                    <div class="modal-footer">
                        <div class="row" style="text-align: center">
                            <div class="col-md-6">
                                <button type="button" class="btn btn-primary btn-unshenpi" data-dismiss="modal" onclick="unapp_handle1()">通过</button>
                            </div>
                            <div class="col-md-6">
                                <button type="button" class="btn btn-danger btn-unshenpi" data-dismiss="modal" onclick="unapp_handle2()">拒绝</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div name="chakanshenpi" class="modal fade bs-example-modal-sm m4" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看审批</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">申请时间：</span>
                            <input type="text" id="doneapp_time" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请人：</span>
                            <input type="text" id="doneapp_person" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <input type="text" id="doneapp_fendian" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <input type="text" id="doneapp_bumen" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <input type="text" id="doneapp_zhiwu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请金额：</span>
                            <input type="text" id="doneapp_money" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请项目：</span>
                            <input type="text" id="doneapp_xiangmu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">收款账号：</span>
                            <input type="text" id="doneapp_bankcard" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">申请事由：</span>
                            <textarea class="form-control" id="doneapp_reason" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 150px;resize: none" onfocus="blur()"></textarea>
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 5px;" id="doneapp_pic">
                            <span class="input-group-addon">相关图片：</span>
                        </span>
                            </div>
                        </div>
                        <div id="chankanshenpitupian" class="row">
                        </div>
                        <span id='doneapp_personid' style='display: none'></span>
                    </div>
                </div>
            </div>
        </div>
        <div name="xiugaiyuangong" class="modal fade bs-example-modal-sm m6" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h3 class="modal-header" style="text-align: center">修改员工信息</h3>
                        <div class="modal-body" style="padding-left: 20%">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">内部编号：</span>
                            <input type="text" id="change1_id" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">所属分店：</span>
                            <select onchange="liandongBranch6(this);" class="selectpicker" id="change1_fendian">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">所属部门：</span>
                            <select class="selectpicker" id="change1_bumen">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">员工职务：</span>
                            <select class="selectpicker" id="change1_zhiwu" onclick="xiugaidianzhang(this)">
                            </select>
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">员工姓名：</span>
                            <input type="text" id="change1_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="change1_tel" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <div class="form-group">
                                <label>入职时间：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='datetimepicker2'>
                                    <input type='text' id="change1_entry" value="" class="form-control" />
                                    <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                </div>
                            </div>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录帐号：</span>
                            <input type="text" id="change1_account" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">登录密码：</span>
                            <input type="text" id="change1_password" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                        </span>
                        </div>
                        <div class="modal-footer">
                            <button type="button" id="changeyuangong1" class="btn btn-primary" data-dismiss="modal">确认修改</button>
                        </div>
                    </div>
                </div>
            </div>
        <div name="chakanbaoxiu" class="modal fade bs-example-modal-sm m7" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看报修</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">租客姓名：</span>
                            <input type="text" id="repair1_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="repair1_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">报修时间：</span>
                            <input type="text" id="repair1_baoxiutime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="repair1_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">报修项目：</span>
                            <input type="text" id="repair1_xiangmu" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                                </span>
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">故障描述：</span>
                            <input type="text" id="repair1_miaoshu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="repair1_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input type="text" id="repair1_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">结果备注：</span>
                                <textarea name="" id="repair1_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                            </span>
                            </div>
                        </div>
                        <div class="row">
                            <span id="repair1_pic" class="input-group input-group-sm" style="margin-top: 5px;">
                            <span id="guzhangtupian" class="input-group-addon">故障图片：</span>

                        </span>
                        </div>
                        <div id="repair_picddd" class="row">

                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chulibaoxiu" class="modal fade bs-example-modal-sm m8" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理报修</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">租客姓名：</span>
                            <input type="text" id="repair_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="repair_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">报修时间：</span>
                            <input type="text" id="repair_baoxiutime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="repair_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">报修项目：</span>
                            <input type="text" id="repair_xiangmu" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">故障描述：</span>
                            <input type="text" id="repair_miaoshu" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input id="repair_person" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input id="repair_chulishijian" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">结果备注：</span>
                                <textarea name="" id="repair_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                            </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span id="repair_pic"  class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">故障图片：</span>
                        </span>
                            </div>
                        </div>
                        <div id="repair_picccc" class="row">
                        </div>
                        <span id='repair_id' style='display: none'></span>
                    </div>
                    <div class="modal-footer">
                        <button id="repair_querenchuli" type="button" class="btn btn-warning"  data-dismiss="modal">确认处理</button>
                    </div>
                </div>
            </div>
        </div>
        <%--<div name="tianjiabaoxiu" class="modal fade bs-example-modal-sm m9" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加报修</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">租客姓名：</span>
                                    <input type="text" id="repairName" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">联系电话：</span>
                                    <input type="text" id="repairPhone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <div class="form-group">
                                    <label>选择日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker12'>
                                        <input type='text'  id="add_entry12" class="form-control" />
                                        <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋地址：</span>
                                    <input type="text" id="repairAddress" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">报修项目：</span>
                                    <input type="text" id="repairPro" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">故障描述：</span>
                                    <input type="text" id="repairDesc" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">故障图片：</span>
                                    <span style="width: 200px;">
                                     <input type="file" onchange="yulantijiaobaoxiu();" value="上传图片" id="insertRepairImgs" style="display: none;" multiple>
                                    <button type="button" onclick="insertRepairImgs();"
                                            class="btn btn-primary" aria-describedby="sizing-addon3" style="width: 100px;">上传图片</button>
                                    </span>

                                </span>
                        </div>
                        <div id="tianjiabaoxiutupian" class="row">

                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="querentijiao()" class="btn btn-primary" data-dismiss="modal">确认提交</button>
                    </div>
                </div>
            </div>
        </div>--%>
        <div name="chakanweituo" class="modal fade bs-example-modal-sm m11" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看委托</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">您的姓名：</span>
                            <input type="text" id="online1_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="online1_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">具体房型：</span>
                            <input type="text" id="online1_type" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input type="text" id="online1_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋面积：</span>
                            <input type="text" id="online1_area" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">可租年限：</span>
                            <input type="text" id="online1_year" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="online1_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="online1_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="online1_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chuliweituo" class="modal fade bs-example-modal-sm m12" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理委托</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                 <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">您的姓名：</span>
                            <input type="text" id="online_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="online_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">可租年限：</span>
                            <input type="text" id="online_year" class="form-control" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input id="online_chulishijian" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">具体房型：</span>
                            <input type="text" id="online_type" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋面积：</span>
                            <input type="text" id="online_area" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input id="online_person" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="online_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="online_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <span id='online_id' style='display: none'></span>
                    </div>
                    <div class="modal-footer">
                        <button id="online_querenchuli" type="button" class="btn btn-warning"  data-dismiss="modal">确认处理</button>
                    </div>
                </div>
            </div>
        </div>
<%--
        <div name="tianjiaweituo" class="modal fade bs-example-modal-sm m10" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加委托</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">您的姓名：</span>
                                    <input id="weituoxingming" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">联系电话：</span>
                                    <input id="weituodianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">可租年限：</span>
                                    <input id="kezunianxian" type="text" class="form-control" aria-describedby="sizing-addon3" style="width: 100px;">年
                                </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">具体房型：</span>
                                    <input id="jutifangxing" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋面积：</span>
                                    <input id="fwmianji" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">㎡
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋地址：</span>
                                    <input id="fwdizhi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="insertWeituo();" class="btn btn-primary" data-dismiss="modal">确认提交</button>
                    </div>
                </div>
            </div>
        </div>
--%>
        <div name="chakantousu" class="modal fade bs-example-modal-sm m13" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看投诉</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">租客姓名：</span>
                            <input type="text" id="complaint1_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="complaint1_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">投诉时间：</span>
                            <input type="text" id="complaint1_tousutime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">投诉内容：</span>
                            <input type="text" id="complaint1_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="complaint1_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="complaint1_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">处理时间：</span>
                                    <input type="text" id="complaint1_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="complaint1_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chulitousu" class="modal fade bs-example-modal-sm m14" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理投诉</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">租客姓名：</span>
                            <input type="text" id="complaint_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="complaint_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">投诉时间：</span>
                            <input type="text" id="complaint_tousutime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">投诉内容：</span>
                            <input type="text" id="complaint_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">房屋地址：</span>
                            <input type="text" id="complaint_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="complaint_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input type="text" id="complaint_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="complaint_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <span id='complaint_id' style='display: none'></span>
                    </div>
                    <div class="modal-footer">
                        <button id="complaint_querenchuli" type="button" class="btn btn-warning"  data-dismiss="modal">确认处理</button>
                    </div>
                </div>
            </div>
        </div>
<%--
        <div name="tianjiatousu" class="modal fade bs-example-modal-sm m15" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加投诉</h3>
                    <div class="modal-body">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">您的姓名：</span>
                                    <input type="text" id="tousu_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">联系电话：</span>
                                    <input type="text" id="tousu_tel" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">投诉时间：</span>
                                    <input type="text" id="tousu_time" class="form-control" value="系统自动生成" aria-describedby="sizing-addon3" style="width: 100px;" onfocus="blur()">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋地址：</span>
                                    <input type="text" id="tousu_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">投诉内容：</span>
                                    <input type="text" id="tousu_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" id="tousu_tijiao" class="btn btn-primary" data-dismiss="modal">确认提交</button>
                    </div>
                </div>
            </div>
        </div>
--%>
        <div name="chakanyuyue" class="modal fade bs-example-modal-sm m16" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">查看预约</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">您的姓名：</span>
                            <input type="text" id="reservation1_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="reservation1_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="reservation1_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">看房时间：</span>
                            <input type="text" id="reservation1_yuyuetime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">看房区域：</span>
                            <input type="text" id="reservation1_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input type="text" id="reservation1_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">备注信息：</span>
                            <input type="text" id="reservation1_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="reservation1_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chuliyuyue" class="modal fade bs-example-modal-sm m17" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">处理预约</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">您的姓名：</span>
                            <input type="text" id="reservation_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">联系电话：</span>
                            <input type="text" id="reservation_phone" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理人员：</span>
                            <input type="text" id="reservation_person" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                            <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">看房时间：</span>
                            <input type="text" id="reservation_yuyuetime" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">看房区域：</span>
                            <input type="text" id="reservation_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                            <span class="input-group-addon">处理时间：</span>
                            <input type="text" id="reservation_chulishijian" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                            <span class="input-group-addon">备注信息：</span>
                            <input type="text" id="reservation_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                        </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">结果备注：</span>
                                    <textarea name="" id="reservation_beizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <span id='reservation_id' style='display: none'></span>
                    </div>
                    <div class="modal-footer">
                        <button id="reservation_querenchuli" type="button" class="btn btn-warning"  data-dismiss="modal">确认处理</button>
                    </div>
                </div>
            </div>
        </div>
<%--
        <div name="tianjiayuyue" class="modal fade bs-example-modal-sm m18" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content" style="padding-left: 20px">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加预约</h3>
                    <div class="modal-body">
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">您的姓名：</span>
                                    <input type="text" id="yuyue_name" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">联系电话：</span>
                                    <input type="text" id="yuyue_tel" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <div class="form-group">
                            <label>看房时间：</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id='datetimepicker11'>
                                <input id="yuyue_time" type='text' class="form-control" />
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </div>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">看房区域：</span>
                                    <input type="text" id="yuyue_addr" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">备注信息：</span>
                                    <input type="text" id="yuyue_info" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" id="yuyue_tijiao" class="btn btn-primary" data-dismiss="modal">确认提交</button>
                    </div>
                </div>
            </div>
        </div>
--%>
        <div name="tianjiafangyuan" class="modal fade bs-example-modal-lg m20" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 style="text-align: center">添加房源信息</h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源编号：</span>
                                    <input id="listingIdl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同编号：</span>
                                    <input id="constractIdl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">分店：</span>
                                    <select onchange="liandongBranch3(this);" id="branchl" class="selectpicker">
                                        <option value="0">请选择分店</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">部门：</span>
                                    <select id="departmentl" class="selectpicker">
                                        <option value="0">请选择部门</option>
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">区域：</span>
                                    <select id="areal"  onchange="liandongArea3(this);" class="selectpicker">
                                        <option value="0">请选择区域</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">小区：</span>
                                    <select  id="communityl" class="selectpicker">
                                <option value="0">请选择小区</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房管：</span>
                                    <select  id="houseManagel" class="selectpicker">
                                <option value="0">请选择房管</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">文秘：</span>
                                    <select  id="secretariall" class="selectpicker">
                                <option value="0">请选择文秘</option>
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">面积：</span>
                                        <input id="acreagel" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                        ㎡
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">类型：</span>
                                        <select  id="borrowTypel" class="selectpicker">
                                            <option value="1">整租</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">户型：</span>
                                        <select id="houseTypel" class="selectpicker">
                                            <option value="1">单室套</option>
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">楼层：</span>
                                        <input id="floorl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电梯：</span>
                                    <select id="elevatorl" class="selectpicker">
                                        <option value="1">有</option>
                                        <option value="2">无</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋地址：</span>
                                    <input id="addressl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">业主姓名：</span>
                                    <input id="ownerNamel" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>起租日：</label>
                                        <!--指定 date标记-->
                                        <div class='input-group date' id='datetimepicker13'>
                                            <input id="startTimel" type='text' class="form-control" />
                                            <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>截止日：</label>
                                        <!--指定 date标记-->
                                        <div class='input-group date' id='datetimepicker14'>
                                            <input id="endTimel" type='text' class="form-control" />
                                            <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <label> </label>
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">免租信息：</span>
                                    <input id="freeRentMsgl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">收房价格：</span>
                                    <input id="housePricel" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">押金：</span>
                                    <input id="depositl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电话：</span>
                                    <input id="ownerPhonel" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">身份证：</span>
                                    <input id="ownerCardl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 90%;">
                                </span>
                                </div>
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">收款账号：</span>
                                    <input id="paymentMsgl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 90%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">水费卡号：</span>
                                    <input id="waterCardl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleWaterl1" payment class="selectpicker">
                                            <option value="1">预付费</option>
                                            <option value="2">后付费</option>
                                            <option value="3">物业收</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleWaterl2" class="selectpicker">
                                            <option value="1">每月</option>
                                            <option value="2">单月</option>
                                            <option value="3">双月</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="waterDayl" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电费卡号：</span>
                                    <input id="electricityCardl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleElectricityl1" class="selectpicker">
                                            <option value="1">预付费</option>
                                            <option value="2">后付费</option>
                                            <option value="3">物业收</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleElectricityl2" class="selectpicker">
                                            <option value="1">每月</option>
                                            <option value="2">单月</option>
                                            <option value="3">双月</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="electricityDayl" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">燃气卡号：</span>
                                    <input id="gasCardl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleGasl1" class="selectpicker">
                                            <option value="1">预付费</option>
                                            <option value="2">后付费</option>
                                            <option value="3">物业收</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleGasl2" class="selectpicker">
                                            <option value="1">每月</option>
                                            <option value="2">单月</option>
                                            <option value="3">双月</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="gasDayl" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <label>交接底数：</label>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">水：</span>
                                    <input id="tBWl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">气：</span>
                                    <input id="tBGl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电总：</span>
                                    <input id="tBEl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电峰：</span>
                                    <input id="tBEHl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电谷：</span>
                                    <input id="tBEHLl" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">付款方式：</span>
                                    <select id="paymentStyle1l" class="selectpicker">
                                        <option value="1">月付</option>
                                        <option value="2">非月付</option>
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10">
                                    <div>
                                        <label>房间配置</label>
                                        <label class="checkbox-inline">
                                            <input id="1111" type="checkbox" value="1"> wifi
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="2222" type="checkbox" value="2"> 热水器
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="3333" type="checkbox" value="3"> 洗衣机
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="4444" type="checkbox" value="4"> 冰箱
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="5555" type="checkbox" value="5"> 燃气灶
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="6666" type="checkbox" value="6"> 油烟机
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="7777" type="checkbox" value="7"> 电视
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="8888" type="checkbox" value="8"> 沙发
                                        </label>
                                        <label class="checkbox-inline">
                                            <input id="9999" type="checkbox" value="9"> 微波炉
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">财务备注：</span>
                                    <textarea name="" id="financeNotel" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源备注：</span>
                                    <textarea name="" id="houseNotel" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同备注：</span>
                                    <textarea name="" id="contractNotel" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源描述：</span>
                                    <textarea name="" id="listingDescriptionl" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <div style="margin-top: 5px;">
                                        <select id="broadBandMsgl" class="selectpicker">
                                            <option value="1">有宽带</option>
                                            <option value="2">无宽带</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <input id="kuandai1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </div>
                                <div class="col-md-2">到期日：</div>
                                <div class="col-md-3">
                                    <div class="form-group" style="display: inline;">
                                        <div class='input-group date' id='datetimepicker29'>
                                            <input id="kuandairiqi1" type='text' value="" class="form-control" />
                                            <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <h5>详细付款计划</h5>
                            <hr>
                            <div class="row">
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-primary" onclick="tianjiafangyuan_yitiao()">添加一条</button>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-success" onclick="tianjiafangyuan_piliang()">批量添加</button>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-danger" onclick="tianjiafangyuan_deleteall()">全部删除</button>
                                </div>
                            </div>
                            <div class="row">
                                <div id="fukuanjihua" style="margin-top: 5px">
                                </div>
                            </div>
                            <hr style="margin-top: 10px">
                            <h5>添加付款计划</h5>
                            <div class="row">
                                <div id="tianjiafangyuan_tianjiayitiao" style="display: none">
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker15'>
                                                <input id="tianjiafangyuan_tianjiayitiao_shijian" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <input id="tianjiafangyuan_tianjiayitiao_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 80%;display: inline">
                                        元
                                    </div>
                                    <div class="col-md-2">
                                        <button type="button" class="btn btn-warning" style="display: inline;" onclick="tianjiafangyuan_yitiao_btn_fun()">确认添加</button>
                                    </div>

                                </div>
                                <div id="tianjiafangyuan_piliangtianjia" style="display: none">
                                    <div class="row" style="margin-left: 5px">
                                        <div class="col-md-3">
                                            <div class="form-group" style="display: inline;">
                                                <div class='input-group date' id='datetimepicker30'>
                                                    <input id="tianjiafangyuan_month1" type='text' value="" class="form-control" />
                                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-1" style="padding-top: 5px">
                                            <span>至</span>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group" style="display: inline;">
                                                <div class='input-group date' id='datetimepicker31'>
                                                    <input id="tianjiafangyuan_month2" type='text' value="" class="form-control" />
                                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            每月
                                            <input id="tianjiafangyuan_day" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                            日
                                        </div>
                                        <div class="col-md-3">
                                            支付
                                            <input id="tianjiafangyuan_piliang_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;display: inline">
                                            元
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-2 col-md-offset-10">
                                            <button class="btn btn-warning" onclick="tianjiafangyuan_piliang_btn_fun()">确认添加</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr style="margin-top: 10px">
                            <h5>房源照片</h5>
                            <div class="row">
                            </div>
                            <div class="row">
                                <div  class="col-md-2">
                                    <input onchange="yulanPic();" type="file" id="insertListingImgs" style="display: none" multiple>
                                    <button type="button" class="btn btn-primary"
                                            onclick="$('#insertListingImgs').click();" style="width: 100px;">上传图片</button>
                                </div>
                                <div class="col-md-2 col-md-offset-1">
                                    <button class="btn btn-danger" onclick="removeListingPic();">清空图片</button>
                                </div>
                            </div>
                            <div id="yulanListingImgs"  class="row">
                            </div>
                            <hr style="margin-top: 10px">
                            <h5>业主资料</h5>
                            <div class="row">
                                <div class="col-md-2">
                                    <input onchange="yulanPic2();" type="file" id="insertOwnerImgs" style="display: none" multiple>
                                    <button type="button" class="btn btn-primary"
                                            onclick="$('#insertOwnerImgs').click();" style="width: 100px;">上传图片</button>
                                </div>
                                <div class="col-md-2 col-md-offset-1">
                                    <button class="btn btn-danger" onclick="removeOwnPic();">清空图片</button>
                                </div>
                            </div>
                            <div id="yulanOwnerImgs"  class="row">

                            </div>
                            <div class="modal-footer">
                                <button type="button" onclick="insertListing();" class="btn btn-primary" data-dismiss="modal">确认添加</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <div name="xiugaifangyuan" class="modal fade bs-example-modal-lg m21" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 style="text-align: center">修改房源信息</h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源编号：</span>
                                    <input id="listingIdl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同编号：</span>
                                    <input id="constractIdl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">分店：</span>
                                    <select id="branchl-1" onchange="liandongBranch2(this);" class="selectpicker">
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">部门：</span>
                                    <select id="departmentl-1" class="selectpicker">
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">区域：</span>
                                    <select id="areal-1" onchange="liandongArea2(this);"  class="selectpicker">
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span  class="input-group-addon">小区：</span>
                                    <select id="communityl-1" class="selectpicker">
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房管：</span>
                                    <select  id="houseManagel-1" class="selectpicker">
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">文秘：</span>
                                    <select  id="secretariall-1" class="selectpicker">
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">面积：</span>
                                        <input id="acreagel-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                        ㎡
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">类型：</span>
                                        <select id="borrowTypel-1" class="selectpicker">
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">户型：</span>
                                        <select id="houseTypel-1" class="selectpicker">
                                        </select>
                                    </span>
                                </div>
                                <div class="col-md-3">
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                        <span class="input-group-addon">楼层：</span>
                                        <input id="floorl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                    </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电梯：</span>
                                    <select id="elevatorl-1" class="selectpicker">
                                        <option value="1">有</option>
                                        <option value="2">无</option>
                                    </select>
                                </span>
                                </div>
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房屋地址：</span>
                                    <input id="addressl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">业主姓名：</span>
                                    <input id="ownerNamel-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>起租日：</label>
                                        <!--指定 date标记-->
                                        <div class='input-group date' id='datetimepicker16'>
                                            <input id="startTimel-1" type='text' class="form-control" />
                                            <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>截止日：</label>
                                        <!--指定 date标记-->
                                        <div class='input-group date' id='datetimepicker17'>
                                            <input id="endTimel-1" type='text' class="form-control" />
                                            <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <label> </label>
                                    <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">免租信息：</span>
                                    <input id="freeRentMsgl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">收房价格：</span>
                                    <input id="housePricel-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">押金：</span>
                                    <input id="depositl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                                </span>
                                </div>
                                <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电话：</span>
                                    <input id="ownerPhonel-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">身份证：</span>
                                    <input id="ownerCardl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 90%;">
                                </span>
                                </div>
                                <div class="col-md-6">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">收款账号：</span>
                                    <input id="paymentMsgl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 90%;">
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">水费卡号：</span>
                                    <input id="waterCardl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleWaterl1-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleWaterl2-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="waterDayl-1" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电费卡号：</span>
                                    <input id="electricityCardl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleElectricityl1-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleElectricityl2-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="electricityDayl-1" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">燃气卡号：</span>
                                    <input id="gasCardl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleGasl1-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px;">
                                        <select id="paymentCycleGasl2-1" class="selectpicker">
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div style="margin-top: 5px">
                                        <input id="gasDayl-1" type="text" value="" style="width: 50%;display: inline">
                                        <label>日缴纳</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <label>交接底数：</label>
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">水：</span>
                                    <input id="tBWl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span  class="input-group-addon">气：</span>
                                    <input id="tBGl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电总：</span>
                                    <input id="tBEl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电峰：</span>
                                    <input id="tBEHl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">电谷：</span>
                                    <input id="tBEHLl-1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                                </div>
                                <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">付款方式：</span>
                                    <select id="paymentStyle1l-1" class="selectpicker">
                                        <option value="1">月付</option>
                                        <option value="2">非月付</option>
                                    </select>
                                </span>
                                </div>
                            </div>
                            <div class="row">

                                <div class="col-md-10">
                                    <div>
                                        <label>房间配置</label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="11"  value="1"> wifi
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="22"  value="2"> 热水器
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="33"  value="3"> 洗衣机
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="44"  value="4"> 冰箱
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="55"  value="5"> 燃气灶
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="66"  value="6"> 油烟机
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="77"  value="7"> 电视
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="88"  value="8"> 沙发
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="99"  value="9"> 微波炉
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">财务备注：</span>
                                    <textarea name="" id="financeNotel-1" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源备注：</span>
                                    <textarea name="" id="houseNotel-1" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同备注：</span>
                                    <textarea name="" id="contractNotel-1" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">房源描述：</span>
                                    <textarea name="" id="listingDesclrl-1" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <div style="margin-top: 5px;">
                                        <select id="broadBandMsgl-1" class="selectpicker">
                                            <option value="1">有宽带</option>
                                            <option value="2">无宽带</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <input id="kuandai1_1" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </div>
                                <div class="col-md-2">到期日：</div>
                                <div class="col-md-3">
                                    <div class="form-group" style="display: inline;">
                                        <div class='input-group date' id='datetimepicker40'>
                                            <input id="kuandairiqi1_1" type='text' value="" class="form-control" />
                                            <span class="input-group-addon">
                                                    <span class="glyphicon glyphicon-calendar"></span>
                                                </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <h5>详细付款计划</h5>
                            <hr>
                            <div class="row">
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-primary" onclick="xiugaifangyuan_yitiao()">添加一条</button>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-success" onclick="xiugaifangyuan_piliang()">批量添加</button>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-danger" onclick="xiugaifangyuan_deleteall()">全部删除</button>
                                </div>
                            </div>
                            <div class="row">
                                <div id="fukuanjihua1" style="margin-top: 5px">
                                </div>
                            </div>
                            <hr style="margin-top: 10px">
                            <h5>添加付款计划</h5>
                            <div class="row">
                                <div id="tianjiayitiao1" style="display: none">
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker18'>
                                                <input id="xiugaifangyuan_tianjiayitiao_shijian" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <input id="xiugaifangyuan_tianjiayitiao_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                        元
                                    </div>
                                    <div class="col-md-2">
                                        <button type="button" class="btn btn-warning" style="display: inline;" onclick="xiugaifangyuan_yitiao_btn_fun()">确认添加</button>
                                    </div>

                                </div>
                                <div id="piliangtianjia1" style="display: none">
                                    <div class="row" style="margin-left: 5px">
                                        <div class="col-md-3">
                                            <div class="form-group" style="display: inline;">
                                                <div class='input-group date' id='datetimepicker32'>
                                                    <input id="xiugaifangyuan_month1" type='text' value="" class="form-control" />
                                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-1" style="margin-top: 5px">
                                            <span>至</span>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group" style="display: inline;">
                                                <div class='input-group date' id='datetimepicker33'>
                                                    <input id="xiugaifangyuan_month2" type='text' value="" class="form-control" />
                                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            每月
                                            <input id="xiugaifangyuan_day" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                            日
                                        </div>
                                        <div class="col-md-3">
                                            支付
                                            <input id="xiugaifangyuan_piliang_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;display: inline">
                                            元
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-2 col-md-offset-10">
                                            <button class="btn btn-warning" onclick="xiugaifangyuan_piliang_btn_fun()">确认添加</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <hr style="margin-top: 10px">
                            <h5>房源照片</h5>
                            <div class="row">

                            </div>
                            <div class="row">
                                <div class="col-md-2">
                                    <input id="xiugaishangchuantupian" onchange="xiugaitupian();" style="display: none;" type="file" multiple>
                                    <button class="btn btn-primary" onclick="$('#xiugaishangchuantupian').click();">上传图片</button>
                                </div>
                                <div class="col-md-2 col-md-offset-1">
                                    <button onclick="removeListingPic2();" class="btn btn-danger">清空图片</button>
                                </div>
                            </div>
                            <div id="xiugaitupian" class="row">

                            </div>
                            <hr style="margin-top: 10px">
                            <h5>业主资料</h5>
                            <div class="row">
                                <div class="col-md-2">
                                    <input id="xiugaishangchuantupian2" onchange="xiugaitupian2()" style="display: none;" type="file" multiple>
                                    <button class="btn btn-primary" onclick="$('#xiugaishangchuantupian2').click();">上传图片</button>
                                </div>
                                <div class="col-md-2 col-md-offset-1">
                                    <button onclick="removeOwnPic2();" class="btn btn-danger">清空图片</button>
                                </div>
                            </div>
                            <div id="xiugaitupian2" class="row">

                            </div>
                            <div class="modal-footer">
                                <button onclick="updateListing();" type="button" class="btn btn-primary" data-dismiss="modal">确认修改</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <div name="tianjiafangjian" class="modal fade bs-example-modal-lg m22" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 style="text-align: center">添加房间信息</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房源编号：</span>
                                    <input id="tianjiafangjian_fangyuanid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">朝向：</span>
                                    <input id="tianjiafangjian_face" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房间编号：</span>
                                    <input id="tianjiafangjian_fangjianid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">当前状态：</span>
                                    <select class="selectpicker" id="tianjiafangjian_zhuangtai">
                                        <option value="空置">空置</option>
                                        <option value="收定">收定</option>
                                        <option value="违约">违约</option>
                                        <option value="正常">正常</option>
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3 col-md-offset-1">
                                <div class="form-group">
                                    <label>状态日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker19'>
                                        <input id="tianjiafangjian_zhuangtairiqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">合同编号：</span>
                                    <input id="tianjiafangjian_hetongid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">定价：</span>
                                    <input id="tianjiafangjian_dingjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">签单业务：</span>
                                    <input id="tianjiafangjian_qiandanyewu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">出房价：</span>
                                    <input id="tianjiafangjian_chufangjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">面积：</span>
                                    <input id="tianjiafangjian_mianji" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">押金：</span>
                                    <input id="tianjiafangjian_yajin" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">服务费：</span>
                                    <input id="tianjiafangjian_fuwufei" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">付款方式：</span>
                                    <select class="selectpicker" id="tianjiafangjian_fukuanfangshi">
                                        <option value="月付">月付</option>
                                        <option value="二月付">二月付</option>
                                        <option value="季付">季付</option>
                                        <option value="半年付">半年付</option>
                                        <option value="年付">年付</option>
                                        <option value="全额付">全额付</option>
                                        <option value="其他">其他</option>

                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">租客姓名：</span>
                                    <input id="tianjiafangjian_zukexingming" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">租客电话：</span>
                                    <input id="tianjiafangjian_zukedianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">身份证号：</span>
                                    <input id="tianjiafangjian_shenfenzhenghao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同状态：</span>
                                    <select class="selectpicker" id="tianjiafangjian_hetongzhuangtai">
                                        <option value="新签">新签</option>
                                        <option value="续签">续签</option>
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>起租日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker20'>
                                        <input id="tianjiafangjian_qizuriqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>截止日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker21'>
                                        <input id="tianjiafangjian_jiezhiriqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">欠款：</span>
                                    <input id="tianjiafangjian_qiankuan" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;">
                                    元
                                </span>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>最迟还款日：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker22'>
                                        <input id="tianjiafangjian_zuichihuankuanri" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">性别：</span>
                                    <select class="selectpicker" id="tianjiafangjian_xingbie">
                                        <option value="1">男</option>
                                        <option value="2">女</option>
                                    </select>
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">水表：</span>
                                    <input id="tianjiafangjian_shuibiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">燃气：</span>
                                    <input id="tianjiafangjian_ranqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电总：</span>
                                    <input id="tianjiafangjian_dianzong" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电峰：</span>
                                    <input id="tianjiafangjian_dianfeng" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电谷：</span>
                                    <input id="tianjiafangjian_diangu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">独立电表：</span>
                                    <input id="tianjiafangjian_dulidianbiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">紧急联系人姓名：</span>
                                    <input id="tianjiafangjian_jinjilianxiren" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">紧急联系人电话：</span>
                                    <input id="tianjiafangjian_jinjilianxirendianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div style="margin-top: 10px">
                                    <label>房间配置</label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox3_3" value="3"> 独卫
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox4_3" value="4"> 阳台
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox5_3" value="5"> 空调
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox6_3" value="6"> 床
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox7_3" value="1"> 书桌
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox8_3" value="2"> 衣柜
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12" style="margin-top: 10px;">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">财务备注：</span>
                                    <textarea name="" id="tianjiafangjian_caiwubeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12" style="margin-top: 10px;">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">合同备注：</span>
                                    <textarea name="" id="tianjiafangjian_hetongbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <div class="row" style="margin-bottom: 20px;margin-top: 10px;">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房间备注：</span>
                                    <textarea name="" id="tianjiafangjian_fangjianbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <hr>
                        <h5>详细付款计划</h5>
                        <hr>
                        <div class="row">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" onclick="tianjiafangjian_yitiao()">添加一条</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-success" onclick="tianjiafangjian_piliang()">批量添加</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-danger" onclick="tianjiafangjian_deleteall()">全部删除</button>
                            </div>
                        </div>
                        <div class="row">
                            <div id="fangjian_fukuanjihua" style="margin-top: 5px">
                            </div>
                        </div>
                        <hr style="margin-top: 10px">
                        <h5>添加付款计划</h5>
                        <div class="row">
                            <div id="fangjian_tianjiayitiao" style="display: none">
                                <div class="col-md-3">
                                    <div class="form-group" style="display: inline;">
                                        <div class='input-group date' id='datetimepicker27'>
                                            <input id="tianjiafangjian_tianjiayitiao_shijian" type='text' value="" class="form-control" />
                                            <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <input id="tianjiafangjian_tianjiayitiao_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                    元
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-warning" style="display: inline;" onclick="tianjiafangjian_yitiao_btn_fun()">确认添加</button>
                                </div>

                            </div>
                            <div id="fangjian_piliangtianjia" style="display: none">
                                <div class="row" style="margin-left: 5px">
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker34'>
                                                <input id="tianjiafangjian_month1" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-1" style="margin-top: 5px">
                                        <span>至</span>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker35'>
                                                <input id="tianjiafangjian_month2" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        每月
                                        <input id="tianjiafangjian_day" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                        日
                                    </div>
                                    <div class="col-md-3">
                                        支付
                                        <input id="tianjiafangjian_piliang_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;display: inline">
                                        元
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2 col-md-offset-10">
                                        <button class="btn btn-warning" onclick="tianjiafangjian_piliang_btn_fun()">确认添加</button>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <h5>租客资料</h5>
                        <div class="row">
                            <div class="col-md-2">
                                <input onchange="yulanshangchuantupian2();" id="zukeziliao" type="file" style="display: none;" multiple>
                                <button  type="button" onclick="$('#zukeziliao').click();"
                                         class="btn btn-primary">上传图片</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" onclick="removezukeziliao2();" class="btn btn-danger">清空图片</button>
                            </div>
                        </div>
                    </div>
                    <div id="yulanshangchuantupian2" class="row">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" onclick="insertFangjian()" data-dismiss="modal">确认添加</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="xiugaifangjian" class="modal fade bs-example-modal-lg m23" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 style="text-align: center">修改房间信息</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房源编号：</span>
                                    <input id="xiugaifangjian_fangyuanid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;" onfocus="blur()">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">朝向：</span>
                                    <input id="xiugaifangjian_face" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房间编号：</span>
                                    <input id="xiugaifangjian_fangjianid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">当前状态：</span>
                                    <select class="selectpicker" id="xiugaifangjian_dangqianzhuangtai">
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3 col-md-offset-1">
                                <div class="form-group">
                                    <label>状态日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker28'>
                                        <input id="xiugaifangjian_zhuangtairiqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">合同编号：</span>
                                    <input id="xiugaifangjian_hetongid" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">定价：</span>
                                    <input id="xiugaifangjian_dingjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">签单业务：</span>
                                    <input id="xiugaifangjian_qiandanyewu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">出房价：</span>
                                    <input id="xiugaifangjian_chufangjia" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">面积：</span>
                                    <input id="xiugaifangjian_mianji" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">押金：</span>
                                    <input id="xiugaifangjian_yajin" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">服务费：</span>
                                    <input id="xiugaifangjian_fuwufei" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">付款方式：</span>
                                    <select class="selectpicker" id="xiugaifangjian_fukuanfangshi">
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">租客姓名：</span>
                                    <input id="xiugaifangjian_zukexingming" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">租客电话：</span>
                                    <input id="xiugaifangjian_zukedianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">身份证号：</span>
                                    <input id="xiugaifangjian_shenfenzhenghao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">合同状态：</span>
                                    <select class="selectpicker" id="xiugaifangjian_hetongzhuangtai">
                                    </select>
                                </span>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>起租日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker23'>
                                        <input id="xiugaifangjian_qizuriqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>截止日期：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker24'>
                                        <input id="xiugaifangjian_jiezhiriqi" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">欠款：</span>
                                    <input id="xiugaifangjian_qiankuan" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;">
                                    元
                                </span>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>最迟还款日：</label>
                                    <!--指定 date标记-->
                                    <div class='input-group date' id='datetimepicker25'>
                                        <input id="xiugaifangjian_zuichihuankuanri" type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                    <span class="input-group-addon">性别：</span>
                                    <select class="selectpicker" id="xiugaifangjian_xingbie">
                                    </select>
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">水表：</span>
                                    <input id="xiugaifangjian_shuibiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">燃气：</span>
                                    <input id="xiugaifangjian_ranqi" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电总：</span>
                                    <input id="xiugaifangjian_dianzong" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电峰：</span>
                                    <input id="xiugaifangjian_dianfeng" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">电谷：</span>
                                    <input id="xiugaifangjian_diangu" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">独立电表：</span>
                                    <input id="xiugaifangjian_dulidianbiao" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-3">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">紧急联系人姓名：</span>
                                    <input id="xiugaifangjian_jinjilianxiren" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                            <div class="col-md-5">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">紧急联系人电话：</span>
                                    <input id="jinjilianxirendianhua" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100%;">
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div style="margin-top: 10px">
                                    <label>房间配置</label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox3_4" value="3"> 独卫
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox4_4" value="4"> 阳台
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox5_4" value="5"> 空调
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox6_4" value="6"> 床
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox7_4" value="1"> 书桌
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" id="modal_inlineCheckbox8_4" value="2"> 衣柜
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12" style="margin-top: 10px;">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">财务备注：</span>
                                    <textarea name="" id="xiugaifangjian_caiwubeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12" style="margin-top: 10px;">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">合同备注：</span>
                                    <textarea name="" id="xiugaifangjian_hetongbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <div class="row" style="margin-bottom: 20px;margin-top: 10px;">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 10px;">
                                    <span class="input-group-addon">房间备注：</span>
                                    <textarea name="" id="xiugaifangjian_fangjianbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 200px;resize: none"></textarea>
                                </span>
                            </div>
                        </div>
                        <hr>
                        <h5>详细付款计划</h5>
                        <hr>
                        <div class="row">
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" onclick="xiugaifangjian_yitiao()">添加一条</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-success" onclick="xiugaifangjian_piliang()">批量添加</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-danger" onclick="xiugaifangjian_deleteall()">全部删除</button>
                            </div>
                        </div>
                        <div class="row">
                            <div id="fangjian_fukuanjihua1" style="margin-top: 5px">
                            </div>
                        </div>
                        <hr style="margin-top: 10px">
                        <h5>添加付款计划</h5>
                        <div class="row">
                            <div id="fangjian_tianjiayitiao1" style="display: none">
                                <div class="col-md-3">
                                    <div class="form-group" style="display: inline;">
                                        <div class='input-group date' id='datetimepicker26'>
                                            <input id="xiugaifangjian_tianjiayitiao_shijian" type='text' value="" class="form-control" />
                                            <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <input id="xiugaifangjian_tianjiayitiao_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                    元
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-warning" style="display: inline;" onclick="xiugaifangjian_yitiao_btn_fun()">确认添加</button>
                                </div>

                            </div>
                            <div id="fangjian_piliangtianjia1" style="display: none">
                                <div class="row" style="margin-left: 5px">
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker36'>
                                                <input id="xiugaifangjian_month1" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-1" style="margin-top: 5px">
                                        <span>至</span>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group" style="display: inline;">
                                            <div class='input-group date' id='datetimepicker37'>
                                                <input id="xiugaifangjian_month2" type='text' value="" class="form-control" />
                                                <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        每月
                                        <input id="xiugaifangjian_day" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 40%;display: inline">
                                        日
                                    </div>
                                    <div class="col-md-3">
                                        支付
                                        <input id="xiugaifangjian_piliang_money" type="text" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 60%;display: inline">
                                        元
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2 col-md-offset-10">
                                        <button class="btn btn-warning" onclick="xiugaifangjian_piliang_btn_fun()">确认添加</button>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <hr>
                        <h5>租客资料</h5>
                        <div class="row">
                            <div class="col-md-2">
                                <input onchange="yulanzukeziliaotupian();" id="zukeziliaotupian" type="file" style="display: none;" multiple>
                                <button type="button" onclick="$('#zukeziliaotupian').click();"
                                        class="btn btn-primary">上传图片</button>
                            </div>
                            <div class="col-md-2">
                                <button onclick="removezukeziliao();" type="button" class="btn btn-danger">清空图片</button>
                            </div>
                        </div>
                    </div>
                    <div id="yulanzukeziliaotupian" class="row">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="xiugaifangjian()">确认修改</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="fangyuanjihua" class="modal fade bs-example-modal-lg m24" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="nodal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 style="text-align: center">详细付款计划</h4>
                    </div>
                    <div class="modal-body" id="fangyuanjihua_body">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="fangjianjihua" class="modal fade bs-example-modal-lg m25" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="nodal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 style="text-align: center">详细付款计划</h4>
                    </div>
                    <div class="modal-body" id="fangjianjihua_body">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="chulishixiang" class="modal fade bs-example-modal-sm m26" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <div class="modal-content">
                    <h3 class="modal-header" style="text-align: center">添加备注</h3>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">备注：</span>
                                <textarea name="" id="shixiangbeizhu" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 100%;height: 150px;resize: none"></textarea>
                            </span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <span class="input-group input-group-sm" style="margin-top: 5px">
                                 <span class="input-group-addon">处理人：</span>
                                 <input type="text" id="shixiang_chuliren" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 50%;">
                             </span>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="getData();" id="chulishixiang" class="btn btn-primary" data-dismiss="modal">处理</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="shouru" class="modal fade bs-example-modal-sm m27" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加收入</h3>
                    <div class="modal-body">
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">金额：</span>
                                <input type="text" id="shourujine" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                            </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">事项：</span>
                                <input type="text" id="shourushixiang" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                            </span>
                             <span class="input-group input-group-sm" style="margin-top: 5px">
                                 <span class="input-group-addon">录入员：</span>
                                 <input type="text" id="shouru_luruyuan" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100px;">
                             </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="add_shouru();" id="shouru_tianjia" class="btn btn-primary" data-dismiss="modal">添加</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="zhichu" class="modal fade bs-example-modal-sm m28" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h3 class="modal-header" style="text-align: center">添加支出</h3>
                    <div class="modal-body">
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">金额：</span>
                                <input type="text" id="zhichujine" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                            </span>
                        <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">事项：</span>
                                <input type="text" id="zhichushixiang" class="form-control" value="" aria-describedby="sizing-addon3" style="width: 100px;">
                            </span>
                             <span class="input-group input-group-sm" style="margin-top: 5px">
                                 <span class="input-group-addon">录入员：</span>
                                 <input type="text" id="zhichu_luruyuan" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100px;">
                             </span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="add_zhichu();" id="zhichu_tianjia" class="btn btn-primary" data-dismiss="modal">添加</button>
                    </div>
                </div>
            </div>
        </div>
        <div name="yeji" class="modal fade bs-example-modal-sm m29" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h3 class="modal-header" style="text-align: center">添加业绩</h3>
                        <div class="modal-body">
                            <span class="input-group input-group-sm" style="margin-top: 5px;">
                                <span class="input-group-addon">记录详情：</span>
                                <textarea name="" id="yeji_jiluxiangqing" class="form-control" aria-describedby="sizing-addon3" cols="30" rows="10" style="width: 150px;height: 150px;resize: none"></textarea>
                            </span>
                             <span class="input-group input-group-sm" style="margin-top: 5px">
                                 <span class="input-group-addon">录入员：</span>
                                 <input type="text" id="yeji_luruyuan" class="form-control" value="" aria-describedby="sizing-addon3" onfocus="blur()" style="width: 100px;">
                             </span>
                        </div>
                        <div class="modal-footer">
                            <button type="button" onclick="add_yeji();" id="yeji_tianjia" class="btn btn-primary" data-dismiss="modal">添加</button>
                        </div>
                    </div>
                </div>
            </div>

        <div id="empType" style="display: none">${employee.empType}</div>

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
		    if ($("#empType").html()=="1" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#option_employee").css("display","none");
                $("#add_newEmployee button").attr("disabled","true");
            }
            $(".selectpicker").selectpicker({
                width:100
            });
            $('#myModal').on('shown.bs.modal', function () {
                $('#myInput').focus()
            });
            for (var i=1;i<=29;i++){
                $('#datetimepicker'+i).datetimepicker({
                    format: 'YYYY-MM-DD',
                    locale: moment.locale('zh-cn')
                });
                $("#datetimepicker"+i).css("width","200px");
            }
            for (var i=30;i<=37;i++){
                $('#datetimepicker'+i).datetimepicker({
                    format: 'YYYY-MM',
                    locale: moment.locale('zh-cn')
                });
                $("#datetimepicker"+i).css("width","180px");
            }
            $('#datetimepicker40').datetimepicker({
                format: 'YYYY-MM-DD',
                locale: moment.locale('zh-cn')
            });
            $("#datetimepicker40").css("width","200px");
            $("#fangyuan").click(function () {
                myDisplay();
                $("#listing").css("display","block");
                $(".nav_on").eq(0).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(0).css("background-color","white");
            });
            $("#unthings").click(function () {
                myDisplay();
                $("#undeal").css("display","block");
                $(".nav_on").eq(1).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(1).css("background-color","white");
            });
            $("#donethings").click(function () {
                myDisplay();
                $("#dealed").css("display","block");
                $(".nav_on").eq(2).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(2).css("background-color","white");
            });
            $("#myapproval").click(function () {
                myDisplay();
                $("#myapplication").css("display","block");
                $(".nav_on").eq(3).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(3).css("background-color","white");
            });
            $("#unapproval").click(function () {
                myDisplay();
                $("#unapplication").css("display","block");
                $(".nav_on").eq(4).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(4).css("background-color","white");
            });
            $("#doneapproval").click(function () {
                myDisplay();
                $("#applicationed").css("display","block");
                $(".nav_on").eq(5).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(5).css("background-color","white");
            });
            $("#fixmanage").click(function () {
                myDisplay();
                $("#repair").css("display","block");
                $(".nav_on").eq(6).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(6).css("background-color","white");
            });
            $("#entrust").click(function () {
                myDisplay();
                $("#onlinecommunicate").css("display","block");
                $(".nav_on").eq(7).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(7).css("background-color","white");
            });
            $("#complaint").click(function () {
                myDisplay();
                $("#customcomplaint").css("display","block");
                $(".nav_on").eq(8).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(8).css("background-color","white");
            });
            $("#watchhouse").click(function () {
                myDisplay();
                $("#reservation").css("display","block");
                $(".nav_on").eq(9).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(9).css("background-color","white");
            });
            $("#money").click(function () {
                myDisplay();
                $("#finance").css("display","block");
                $(".nav_on").eq(10).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(10).css("background-color","white");
            });
            $("#staff").click(function () {
                myDisplay();
                $("#employee").css("display","block");
                $(".nav_on").eq(11).css("display","block");
                $(".nav_btn").css("background-color","lightslategray");
                $(".nav_btn").eq(11).css("background-color","white");
            });
            if ($("#yuangong_zhiwu").find("option:selected").text()=="业务"){
                $(".sidebar-nav .dropdown").eq(0).css("display","none");
            }
            if ($("#yuangong_zhiwu").find("option:selected").text()=="业务" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                $("#unapproval").css("display","none");
                $("#doneapproval").css("display","none");
            }
            if ($("#yuangong_zhiwu").find("option:selected").text()=="业务" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $(".sidebar-nav .dropdown").eq(2).css("display","none");
            }
            if ($("#yuangong_zhiwu").find("option:selected").text()=="业务" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                $("#money").css("display","none");
            }
            /*$('.modal').on('hidden.bs.modal', function () {
                $(':input',this).not(':button,:submit,:reset').val('').removeAttr('checked').removeAttr('checked');
            });*/
            for(var i=0;i<12;i++){
                (function (i) {
                    $(".my_close").eq(i).click(function (event) {
                        event.stopPropagation();
                        $(".nav_on").eq(i).css("display","none");
                        var ddd = $(".ddd");
                        if (ddd.eq(i).css("display")!="none"){
                            ddd.eq(i).css("display","none");
                            $(".nav_btn").eq(i).css("background-color","lightslategray");
                            var my_flag=0;
                            if (i<11){
                                my_flag=0;
                                for (var j=i+1;j<=11;j++) {
                                    if ($(".nav_on").eq(j).css("display")!="none"){
                                        ddd.eq(j).css("display","block");
                                        $(".nav_btn").eq(j).css("background-color","white");
                                        my_flag=1;
                                        break;
                                    }
                                }
                                if (my_flag==0){
                                    for (var j=i-1;j>=0;j--){
                                        if ($(".nav_on").eq(j).css("display")!="none"){
                                            ddd.eq(j).css("display","block");
                                            $(".nav_btn").eq(j).css("background-color","white");
                                            my_flag=1;
                                            break;
                                        }
                                    }
                                }
                                if (my_flag==0){
                                    ddd.eq(0).css("display","block");
                                    $(".nav_btn").eq(0).css("background-color","white");
                                    $(".nav_on").eq(0).css("display","block");
                                    my_flag=1;
                                }
                            } else{
                                for (var j=10;j>=0;j--){
                                    if ($(".nav_on").eq(j).css("display")!="none"){
                                        ddd.eq(j).css("display","block");
                                        $(".nav_btn").eq(j).css("background-color","white");
                                        my_flag=1;
                                        break;
                                    }
                                }
                                if (my_flag==0) {
                                    ddd.eq(0).css("display","block");
                                    $(".nav_btn").eq(0).css("background-color","white");
                                    $(".nav_on").eq(0).css("display","block");
                                    my_flag=1;
                                }
                            }
                        }
                    });
                })(i);

            }
            for(var i=0;i<12;i++){
                (function (i) {
                    $(".nav_btn").eq(i).click(function () {
                        if($(".nav_btn").eq(i).css("background-color")=="rgb(119, 136, 153)"){
                            $(".nav_btn").css("background-color","lightslategray");
                            $(".nav_btn").eq(i).css("background-color","white");
                            myDisplay();
                            $(".ddd").eq(i).css("display","block");
                        }
                    });
                })(i);
            }
		});
		function myDisplay() {
            $(".ddd").css("display","none");
        }
	</script>
    <script type="text/javascript" src="../../static/js/listing.js"></script>
    <script type="text/javascript" src="../../static/js/application.js"></script>
    <script type="text/javascript" src="../../static/js/unApplication.js"></script>
    <script type="text/javascript" src="../../static/js/doneApplication.js"></script>
    <script type="text/javascript" src="../../static/js/repair.js"></script>
    <script type="text/javascript" src="../../static/js/onlinecommunicate.js"></script>
    <script type="text/javascript" src="../../static/js/complaint.js"></script>
    <script type="text/javascript" src="../../static/js/reservation.js"></script>
    <script type="text/javascript" src="../../static/js/employee.js"></script>
    <script type="text/javascript" src="../../static/js/deal.js"></script>
    <script type="text/javascript" src="../../static/js/finance.js"></script>

    <%}else{%>
       <%-- <%response.sendRedirect("login.jsp");%>--%>
    <%}%>
</body>
</html>