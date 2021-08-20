package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.dao.SwingMemberDAO;
import a.b.c.swing.member.dao.SwingMemberDAOImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberServiceImpl implements SwingMemberService {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectAll() �Լ� ���� ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectAll();
		return aList;
	}

	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelect() �Լ� ���� ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelect(svo);
		return aList;
	}

	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smInsert() �Լ� ���� ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smInsert(svo);
		return bool;
	}

	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smUpdate() �Լ� ���� ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smUpdate(svo);
		return bool;
	}

	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smDelete() �Լ� ���� ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smDelete(svo);
		return bool;
	}
}
