/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-11-04 14:20:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/dev/framework-workspace/danaa/danaa/src/main/webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1598506533000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MNR CLINIC</title>\r\n");
      out.write("<script src=\"resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//쿠키설정    \r\n");
      out.write("function setCookie( name, value, expiredays )\r\n");
      out.write("{\r\n");
      out.write("var todayDate = new Date();\r\n");
      out.write("todayDate.setDate( todayDate.getDate() + expiredays );\r\n");
      out.write("document.cookie = name + '=' + escape( value ) + '; path=/; expires=' + todayDate.toGMTString() + ';'\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//쿠키 불러오기\r\n");
      out.write("function getCookie(name) \r\n");
      out.write("{ \r\n");
      out.write("    var obj = name + \"=\"; \r\n");
      out.write("    var x = 0; \r\n");
      out.write("    while ( x <= document.cookie.length ) \r\n");
      out.write("    { \r\n");
      out.write("        var y = (x+obj.length); \r\n");
      out.write("        if ( document.cookie.substring( x, y ) == obj ) \r\n");
      out.write("        { \r\n");
      out.write("            if ((endOfCookie=document.cookie.indexOf( \";\", y )) == -1 ) \r\n");
      out.write("                endOfCookie = document.cookie.length;\r\n");
      out.write("            return unescape( document.cookie.substring( y, endOfCookie ) ); \r\n");
      out.write("        } \r\n");
      out.write("        x = document.cookie.indexOf( \" \", x ) + 1; \r\n");
      out.write("        if ( x == 0 ) \r\n");
      out.write("            break; \r\n");
      out.write("    } \r\n");
      out.write("    return \"\"; \r\n");
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("//닫기 버튼 클릭시\r\n");
      out.write("function closeWin(key)\r\n");
      out.write("{\r\n");
      out.write("    if($(\"#todaycloseyn\").prop(\"checked\"))\r\n");
      out.write("    {\r\n");
      out.write("        setCookie('divpop'+key, 'Y' , 1 );\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#divpop\"+key+\"\").hide();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){    \r\n");
      out.write("    if(getCookie(\"divpop1\") !=\"Y\"){\r\n");
      out.write("        $(\"#divpop1\").show();\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 슬라이드팝업\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    \r\n");
      out.write("    var popup = new Swiper('.popup', {\r\n");
      out.write("       loop:true,\r\n");
      out.write("       speed : 600,\r\n");
      out.write("       autoplay : {\r\n");
      out.write("          delay : 3000,\r\n");
      out.write("          disableOnInteraction : false,\r\n");
      out.write("       },\r\n");
      out.write("       });\r\n");
      out.write(" })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("      \r\n");
      out.write("   .new_pop{z-index:99999; position:absolute; top:8%; left:10%; margin:0 0 0 -100px; width:320px;display:none}\r\n");
      out.write("   .new_pop .bottom{ overflow:hidden; padding:0 0 0 10px; height:40px; background:#333;}\r\n");
      out.write("   .new_pop .bottom label{ display:block; float:left; line-height:40px; font-size:14px; font-weight:inherit; color:#FFF;}\r\n");
      out.write("   .new_pop .bottom label input{ display:block; float:left; margin:10px 5px 0 0; width:20px; height:20px;}\r\n");
      out.write("   .new_pop .bottom p{ float:right; padding:0 10px; border-left:1px solid #666; text-align:center; line-height:40px; font-size:14px; color:#FFF;}\r\n");
      out.write("      </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=\"notice_form\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"divpop1\" class=\"new_pop\">    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"swiper-container popup\">\r\n");
      out.write("            <ul class=\"swiper-wrapper\">\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"bottom\">\r\n");
      out.write("\r\n");
      out.write("         <label><input type='checkbox' name='chkbox' id='todaycloseyn' value='Y'>24시간동안 열지 않음</label>  \r\n");
      out.write("\r\n");
      out.write("         <a href='#' onclick=\"javascript:closeWin(1);\"><p class=\"cp\">닫기</p></a>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/popup/popup.jsp(93,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/popup/popup.jsp(93,13) '${ requestScope.plist }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ requestScope.plist }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/popup/popup.jsp(93,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("p");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <li class=\"swiper-slide\"><a href=\"nlist.do?page=1\"><img src=\"resources/pupfiles/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ p.popup_refile }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"팝업이미지\"></a></li>\r\n");
            out.write("            \t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
