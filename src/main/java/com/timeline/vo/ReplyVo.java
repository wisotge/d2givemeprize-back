package com.timeline.vo;

public class ReplyVo {
	
	//Database Column
	private int replyNo;
	private String replyContent;
	private String replyRegDate;
	private int writerNo;
	private int postNo;
	private int replyGroupNo;
	private int replyOrderNo;
	private int replyDepth;
	
	//Additional Field
	
	
	public ReplyVo() {
		
	}

	public ReplyVo(int replyNo, String replyContent, String replyRegDate, int writerNo, int postNo, int replyGroupNo,
			int replyOrderNo, int replyDepth) {
		super();
		this.replyNo = replyNo;
		this.replyContent = replyContent;
		this.replyRegDate = replyRegDate;
		this.writerNo = writerNo;
		this.postNo = postNo;
		this.replyGroupNo = replyGroupNo;
		this.replyOrderNo = replyOrderNo;
		this.replyDepth = replyDepth;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyRegDate() {
		return replyRegDate;
	}

	public void setReplyRegDate(String replyRegDate) {
		this.replyRegDate = replyRegDate;
	}

	public int getWriterNo() {
		return writerNo;
	}

	public void setWriterNo(int writerNo) {
		this.writerNo = writerNo;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public int getReplyGroupNo() {
		return replyGroupNo;
	}

	public void setReplyGroupNo(int replyGroupNo) {
		this.replyGroupNo = replyGroupNo;
	}

	public int getReplyOrderNo() {
		return replyOrderNo;
	}

	public void setReplyOrderNo(int replyOrderNo) {
		this.replyOrderNo = replyOrderNo;
	}

	public int getReplyDepth() {
		return replyDepth;
	}

	public void setReplyDepth(int replyDepth) {
		this.replyDepth = replyDepth;
	}

	@Override
	public String toString() {
		return "ReplyVo [replyNo=" + replyNo + ", replyContent=" + replyContent + ", replyRegDate=" + replyRegDate
				+ ", writerNo=" + writerNo + ", postNo=" + postNo + ", replyGroupNo=" + replyGroupNo + ", replyOrderNo="
				+ replyOrderNo + ", replyDepth=" + replyDepth + "]";
	}
	
}
