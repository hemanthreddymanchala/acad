package com.fm.model.inter;
import java.util.List;

import com.fm.model.pojo.Form;
public interface FormDAO {
	
		
		public int saveForm(Form fm);
		public int validateUser(String user,String pwd);
	/*	public int updateForm(Form fm);
		public List<Form> getAllForm();
		public int deleteForm(int fmid);
		public Form getByuserId(int fmid);
*/
	}


