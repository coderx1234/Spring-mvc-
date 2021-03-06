package vo;

public class ResponseWrapper<T> {

	private Status status;
	private T result;
	
	private static Status successStatus= new Status("Success",200);
	//private static Status errorStatus= new Status("Error",500);

	
	@Override
	public String toString() {
		return "ResponseWrapper [status=" + status + ", result=" + result + "]";
	}
	public ResponseWrapper(Status status, T result) {
		this.status = status;
		this.result = result;
	}
	
	public ResponseWrapper() {
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
	public ResponseWrapper<T> getSuccessResponse(T result){
		return new ResponseWrapper<T>(successStatus,result);
	}
	
//	public ResponseWrapper<T> getErrorResponse(T result){
//		return new ResponseWrapper<T>(errorStatus,result);
//	}
}
