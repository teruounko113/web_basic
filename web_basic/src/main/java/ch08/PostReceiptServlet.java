package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostReceiptServlet")
public class PostReceiptServlet extends HttpServlet {
	
	//doPost()メソッド
 	public void doPost(HttpServletRequest request, HttpServletResponse response)
 	throws ServletException, IOException {
 		
 		request.setCharacterEncoding("UTF-8");
 		
 		//パラメータの取得
 		String sei = request.getParameter("sei");
 		String mei = request.getParameter("mei");
 
 		//コンテンツタイプの設定
 		response.setContentType("text/html; charset=UTF-8");
 		PrintWriter out = response.getWriter();
 
 		//画面出力
 		if(!sei.equals("") || !mei.equals("")) {
 			out.printf("あなたの名前は %s %s です。",sei, mei);
 		}else {
 			out.println("値が入力されていません。");
 		}
 	}
 }