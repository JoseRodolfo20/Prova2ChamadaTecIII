
public enum ErrorCode {
	
	VALIDATION,
	FILENOTFOUND;
	private Integer code;
	
	public void ErrorCode(Integer code) {
		
	}
	
	public Integer getCode() {
		return code;
	}
	
	public Integer fromCode(Integer code) {
		return code;
	}

}
