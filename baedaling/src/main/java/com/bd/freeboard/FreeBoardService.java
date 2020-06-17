package com.bd.freeboard;

import java.util.List;
import java.util.Map;

public interface FreeBoardService {
	public void insertBoard(FreeBorad dto, String pathname) throws Exception;
	public List<FreeBorad> listBoard(Map<String, Object> map);
	public int dataCount(Map<String, Object> map);
	public FreeBorad readBoard(int num);
	public void updateHitCount(int num) throws Exception;
	public FreeBorad preReadBoard(Map<String, Object> map);
	public FreeBorad nextReadBoard(Map<String, Object> map);
	public void updateBoard(FreeBorad dto, String pathname)throws Exception;
	public void deleteBoard(int num, String pathname, String userId) throws Exception;

	//파일
	public void insertFile(FreeBorad dto) throws Exception;
	public List<FreeBorad> listFile(int num);
	public FreeBorad readFile(int fileNum);
	public void deleteFile(Map<String, Object> map) throws Exception;
	
	//좋아요 
	public void insertBoardLike(Map<String, Object> map) throws Exception;
	public int boardLikeCount(int num);
	
	//댓글
	public void insertReply(Reply dto)throws Exception;
	public List<Reply> listReply(Map<String, Object> map);
	public int replyCount(Map<String, Object> map);
	public void deleteReply(Map<String, Object> map) throws Exception;

}
