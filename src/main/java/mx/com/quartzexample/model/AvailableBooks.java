package mx.com.quartzexample.model;

import java.util.List;

public class AvailableBooks {

	private Boolean success;
	private List<Book> payload;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Book> getPayload() {
		return payload;
	}

	public void setPayload(List<Book> payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "AvailableBooks [success=" + success + ", payload=" + payload + "]";
	}

}
