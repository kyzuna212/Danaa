/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-26 06:29:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkEmailPopup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MNR CLINIC</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>이메일 수정 페이지</h1>\r\n");
      out.write("\t<div class=\"layer_pop_manage layer_identify open\"\r\n");
      out.write("\t\tid=\"layer_pop_byemail\">\r\n");
      out.write("\t\t<div class=\"layer_manage_wrap\">\r\n");
      out.write("\t\t\t<h4>이메일 수정</h4>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn_layer_close\"\r\n");
      out.write("\t\t\t\tonclick=\"layer_close(this);\">\r\n");
      out.write("\t\t\t\t<span>닫기</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<p class=\"txt\" id=\"layer_title_byemail\" name=\"layer_title_byemail\">이메일로\r\n");
      out.write("\t\t\t\t발송된 인증번호를 입력해주세요.</p>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"mail_confirm_complete\" value=\"n\"\r\n");
      out.write("\t\t\t\tid=\"mail_confirm_complete\">\r\n");
      out.write("\t\t\t<table class=\"tbl_fieldset\">\r\n");
      out.write("\t\t\t\t<caption></caption>\r\n");
      out.write("\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t<col style=\"width: 130px;\">\r\n");
      out.write("\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>이메일</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"confirm_email_id\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"confirm_email_id\" value=\"dashya21\" class=\"inpTypo\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 105px;\"> <span class=\"sri_marks\">@</span> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" id=\"confirm_email_dm\" name=\"confirm_email_dm\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"naver.com\" class=\"inpTypo\" style=\"width: 126px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" id=\"send_code_action_byemail\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"send_code_action_byemail\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_basic_type04 send-code-action\">인증번호 발송</button></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr id=\"email_code_byemail\" name=\"email_code_byemail\">\r\n");
      out.write("\t\t\t\t\t\t<th>인증번호</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"email_code\" name=\"email_code\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"\" class=\"inpTypo\" style=\"width: 96px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn_basic_type04 confirm-action\">확인</button>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"expiredin\" id=\"confirm_remain_mail_time_area\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"confirm_remain_mail_time_area\"><strong></strong></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"bottom_btn_wrap\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn_basic_type01\"\r\n");
      out.write("\t\t\t\t\tonclick=\"layer_close(this);\">취소</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn_basic_type05\"\r\n");
      out.write("\t\t\t\t\tonclick=\"changeConfirmCell('mail')\">변경</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 이메일 수정 팝업 -->\r\n");
      out.write("</body>\r\n");
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
}
