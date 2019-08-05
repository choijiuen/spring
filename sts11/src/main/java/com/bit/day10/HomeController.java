package com.bit.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	
	String uploadDir="C:\\java\\upload\\";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/"
			, method = RequestMethod.GET)
	public String home(HttpSession session) {
		//logger.debug(session.getAttribute("id").toString());
		System.out.println(session.getAttribute("id"));
		return "home";
	}
	
	@RequestMapping(value = "/upload" 
			,method=RequestMethod.POST)
//	public String upload(Model model, MultipartFile file1, String sub) {
	public String upload(Model model, @ModelAttribute FileVo f, String sub) {	//파일 여러개 받을라고 멀티파트는 배열이 안되니깐 Vo로 만들었다 이거 책에 없다 
//		logger.debug(f.getFiles().length+"개");
		//파일 여러개 업로드 할 때
		for(MultipartFile file1 : f.getFiles()) {
			if(file1==null || file1.isEmpty())continue;
			logger.debug(file1.getOriginalFilename());
			
			long time= System.currentTimeMillis();
			String origin =file1.getOriginalFilename();
			String newName=time+origin;			//시간, 하고 원래이름 합한거 
			
			File file=new File(uploadDir+newName);	//파일 이름 중복 막기 위해서 시간 붙여주면 된다 ...
			
			try {
				file1.transferTo(file);				//스프링에서는 밑에 자바처럼 io쓸 필요없이 이렇게만 하면 파일 업로드 된다.
			} catch (IllegalStateException e) {				
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		InputStream is = null;
//		OutputStream os = null;
//		try {
//			is= file1.getInputStream();
//			os= new FileOutputStream(file);
//			int temp=0;
//			while((temp=is.read())!=-1) {
//				os.write(temp);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				if(os!=null)os.close();
//				if(is!=null)is.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		model.addAttribute("filename",newName );
//		model.addAttribute("origin",origin );
		return "down";
	}
	
	@RequestMapping("/download/{filename:.+}")
	public void download(String origin, @PathVariable String filename, HttpServletResponse resp) {
		
		logger.debug("down : "+filename);
		logger.debug("down : "+origin);
		
		//이거 옛날거라 지금은 안씀 appli 어쩌구 //파일을 브라우저가 직접 처리하지 못하도록 모르는 형식으로 전달 
		//resp.setContentType("application/octet-stream;charset=\"utf-8\"");	//이거해주면 무조건 다운로드 뜸 , 페이지에 이미지 뜨는게 아니라 
		//
		
		//다운받을 이름 시간 때고 원래이름으로 다운받기 
		//resp.setHeader("Content-Disposition", "attachment; filename=\""+origin+"\"");	
		//
		File file=new File(uploadDir+filename);
		OutputStream os =null;
		InputStream is =null;
		
		try {
			os=resp.getOutputStream();
			is=new FileInputStream(file);
			int temp=0;
			while((temp=is.read())!=-1) {
				os.write(temp);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if(os!=null)os.close();
			if(is!=null)is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	}
	
}
