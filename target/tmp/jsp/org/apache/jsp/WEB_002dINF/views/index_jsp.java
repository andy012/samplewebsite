package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; UTF-8\">\r\n");
      out.write("    <title>andydoo</title>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#tabs1 a\").click(function (e) {\r\n");
      out.write("                $(this).tab('show');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <!-- Static navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">MD5在线</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\">MD5计算</a></li>\r\n");
      out.write("                    <li><a href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\">MD5校验</a></li>\r\n");
      out.write("                    <li><a href=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\">我的MD5</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                   </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div><!--/.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"jumbotron\">\r\n");
      out.write("        <div class=\"row\" style=\"background-color:#ffffff;padding:10px;\">\r\n");
      out.write("            <div class=\"span12\">\r\n");
      out.write("                <ul class=\"nav-tabs nav\" id=\"tabs1\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"#tabs-1\">文本</a></li>\r\n");
      out.write("                    <li><a href=\"#tabs-2\">文件</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"tab-content\">\r\n");
      out.write("                    <div class=\"tab-pane active\" id=\"tabs-1\">\r\n");
      out.write("                        <div id=\"textdiv\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"name\">文本框</label>\r\n");
      out.write("                                <textarea id =\"sourcetextstring\" class=\"form-control\" rows=\"3\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"clickText()\">计算MD5值</button>\r\n");
      out.write("                            <div class=\"input-group input-group-lg\" style=\"margin-top:20px\">\r\n");
      out.write("                                <span class=\"input-group-addon\">MD5值</span>\r\n");
      out.write("                                <input type=\"text\" id=\"textmd5\" class=\"form-control\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"panel panel-default\" style=\"margin-top:40px\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\">\r\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("                                       href=\"#collapseOne\">\r\n");
      out.write("                                        保存到我的服务器\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"collapseOne\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <form class=\"form-horizontal\" role=\"form\"style=\"font-size:18px\" action=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" method=\"POST\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"text_detail\" class=\"col-sm-2 control-label\">描述：</label>\r\n");
      out.write("                                            <div class=\"col-sm-8\"style=\"margin-top:13px\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"text_detail\" name=\"detail\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\" >\r\n");
      out.write("                                            <label for=\"text_savemd5\" class=\"col-sm-2 control-label\">MD5值：</label>\r\n");
      out.write("                                            <div class=\"col-sm-8\" style=\"margin-top:13px\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"text_savemd5\" name=\"md5\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-8\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\">保存</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane\" id=\"tabs-2\">\r\n");
      out.write("                        <div id=\"filediv\" style=\"margin-top:20px\">\r\n");
      out.write("                            <input type=\"file\" id=\"file\">\r\n");
      out.write("                            <div class=\"input-group input-group-lg\" style=\"margin-top:20px\">\r\n");
      out.write("                                <span class=\"input-group-addon\">MD5值</span>\r\n");
      out.write("                                <input type=\"text\" id=\"filemd5\" class=\"form-control\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"myprogress\" class=\"progress progress-striped\" style=\"display:none;margin-top:20px\">\r\n");
      out.write("                            <div class=\"progress-bar progress-bar-info\" role=\"progressbar\"\r\n");
      out.write("                                 aria-valuenow=\"60\" aria-valuemin=\"0\" id=\"progressfile\" aria-valuemax=\"100\"\r\n");
      out.write("                                 style=\"width: 0%\">\r\n");
      out.write("                                <span id=\"progresstext\">0%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel panel-default\" style=\"margin-top:40px\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\">\r\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("                                       href=\"#collapseTwo\">\r\n");
      out.write("                                        保存到我的服务器\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"collapseTwo\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <form class=\"form-horizontal\"  role=\"form\" action=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\" method=\"POST\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"file_detail\" class=\"col-sm-2 control-label\">描述：</label>\r\n");
      out.write("                                            <div class=\"col-sm-8\"style=\"margin-top:15px\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"file_detail\" name=\"detail\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\" >\r\n");
      out.write("                                            <label for=\"file_savemd5\" class=\"col-sm-2 control-label\">MD5值：</label>\r\n");
      out.write("                                            <div class=\"col-sm-8\" style=\"margin-top:15px\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"file_savemd5\" name=\"md5\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-8\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\">保存</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    //\t$(\"#myprogress\").hide()\r\n");
      out.write("\r\n");
      out.write("    function clickText(){\r\n");
      out.write("        var text=$(\"#sourcetextstring\").val().trim()\r\n");
      out.write("        if(text==\"\"){alert(\"您输入的字符串为空！\");return;}\r\n");
      out.write("        var p=SparkMD5.hash(text);\r\n");
      out.write("        $(\"#textmd5\").val(p);\r\n");
      out.write("        $(\"#text_detail\").val(text);\r\n");
      out.write("        $(\"#text_savemd5\").val(p);\r\n");
      out.write("        //alert(p);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"file\").addEventListener(\"change\", function() {\r\n");
      out.write("\r\n");
      out.write("        var fileReader = new FileReader(), box = $(\"#filemd5\");\r\n");
      out.write("        blobSlice = File.prototype.mozSlice || File.prototype.webkitSlice || File.prototype.slice, file = document.getElementById(\"file\").files[0], chunkSize = 2097152,\r\n");
      out.write("            // read in chunks of 2MB\r\n");
      out.write("                chunks = Math.ceil(file.size / chunkSize), currentChunk = 0, spark = new SparkMD5();\r\n");
      out.write("\r\n");
      out.write("        fileReader.onload = function(e) {\r\n");
      out.write("            console.log(\"read chunk nr\", currentChunk + 1, \"of\", chunks);\r\n");
      out.write("            spark.appendBinary(e.target.result);\r\n");
      out.write("            // append binary string\r\n");
      out.write("            currentChunk++;\r\n");
      out.write("            $(\"#progressfile\").css(\"width\",(currentChunk+1)*100/chunks+\"%\")\r\n");
      out.write("            $(\"#progresstext\").text(Math.round((currentChunk+1)*100/chunks)+\"%\")\r\n");
      out.write("\r\n");
      out.write("            if (currentChunk < chunks) {\r\n");
      out.write("                loadNext();\r\n");
      out.write("\r\n");
      out.write("            } else {\r\n");
      out.write("                console.log(\"finished loading\");\r\n");
      out.write("                var p=spark.end();\r\n");
      out.write("                box.val(p);\r\n");
      out.write("                console.info(\"computed hash\", spark.end());\r\n");
      out.write("                $(\"#myprogress\").hide()\r\n");
      out.write("                $(\"#file_detail\").val(file.name);\r\n");
      out.write("                $(\"#file_savemd5\").val(p);\r\n");
      out.write("                // compute hash\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        function loadNext() {\r\n");
      out.write("            var start = currentChunk * chunkSize, end = start + chunkSize >= file.size ? file.size : start + chunkSize;\r\n");
      out.write("\r\n");
      out.write("            fileReader.readAsBinaryString(blobSlice.call(file, start, end));\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#progressfile\").css(\"width\",\"0%\")\r\n");
      out.write("        $(\"#progresstext\").text(\"0%\")\r\n");
      out.write("        $(\"#myprogress\").show()\r\n");
      out.write("        loadNext();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/css/navbar.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/css/bootstrap.min.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/js/jquery.min.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/js/bootstrap.min.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/js/spark-md5.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/md5check");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/mymd5");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty pageContext.request.userPrincipal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li><a href=\"");
        if (_jspx_meth_c_url_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\">登录</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_url_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_9.setValue("/auth/login");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty pageContext.request.userPrincipal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"dropdown\">\r\n");
        out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.userPrincipal.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <span class=\"caret\"></span></a>\r\n");
        out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
        out.write("                                    <li><a href=\"");
        if (_jspx_meth_c_url_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">我的Md5</a></li>\r\n");
        out.write("                                    <li><a href=\"");
        if (_jspx_meth_c_url_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">退出</a></li>\r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_url_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_10.setValue("/mymd5");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_11.setValue("/auth/logout");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/savemd5/text");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/savemd5/file");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }
}
