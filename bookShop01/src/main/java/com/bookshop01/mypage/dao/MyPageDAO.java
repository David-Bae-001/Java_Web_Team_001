package com.bookshop01.mypage.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

public interface MyPageDAO {
	public List<OrderVO> selectMyOrderGoodsList(String member_id) throws DataAccessException;
	public List selectMyOrderInfo(String order_id) throws DataAccessException;
	public List<OrderVO> selectMyOrderHistoryList(Map dateMap) throws DataAccessException;
	public void updateMyInfo(Map memberMap) throws DataAccessException;
	public MemberVO selectMyDetailInfo(String member_id) throws DataAccessException;
	public void updateMyOrderCancel(String order_id) throws DataAccessException;
	// 마이페이지 추가
	public void delNewMember(String member_id) throws DataAccessException;
	// Dean
	public List<OrderVO> listChangeMyOrderStatus(String member_id) throws DataAccessException;	
}
