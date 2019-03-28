package com.fm.model.inter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.fm.connection.ConnectionFactory;
import com.fm.model.pojo.Form;

	public class FormDAOImpl implements FormDAO {

		Connection con=null;
		public FormDAOImpl() {
			con=ConnectionFactory.openConn();
		}
		@Override
		public int saveForm(Form fm) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("insert into form values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, fm.getFirstname());
				ps.setString(2, fm.getLastname());
				ps.setInt(3, fm.getAge());
				ps.setString(4, fm.getGender());
				ps.setString(5, fm.getContactnumber());
				ps.setString(6, fm.getCity());
				ps.setString(7, fm.getState());
				ps.setString(8, fm.getUserid());
				ps.setString(9, fm.getPassword());
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Insert form "+e);
			}
			return status;
		}
		@Override
		public int validateUser(String user, String pwd) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("select userid,password from form where userid=? and password=?");
				ps.setString(1, user);
				ps.setString(2, pwd);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
					status=1;
				else
					status=0;
			}catch (Exception e) {
				System.out.println("Error in validate form "+e);
			}
			
			return status;
		}

	/*	@Override
		public int updateForm(Form fm) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("update Form set firstname=?,lastname=?,age=? where empid=?");
				ps.setInt(4, emp.getEmpid());
				ps.setString(1, emp.getEmpname());
				ps.setInt(2, emp.getEmpage());
				ps.setDouble(3, emp.getEmpsalary());
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Update Employee "+e);
			}
			return status;
		}

		@Override
		public List<Form> getAllForm() {
			List<Form> listEmp=new ArrayList<Form>();
			try {			
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from form");
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setEmpage(rs.getInt(3));
					emp.setEmpsalary(rs.getDouble(4));
					listEmp.add(emp);
				}
			} catch (Exception e) {
				System.out.println("Error in getAll Employee "+e);
			}
			return listEmp;
		}
	
		@Override
		public int deleteForm(int fmid) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public Form getByuserId(int fmid) {
			// TODO Auto-generated method stub
			return null;
		}

	
	}
*/
}
