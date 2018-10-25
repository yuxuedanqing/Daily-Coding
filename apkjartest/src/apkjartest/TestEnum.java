package apkjartest;

import java.io.Serializable;

/**
 * 测试enum
 * @author 18911
 *
 */
public interface TestEnum {

	public enum Color implements Serializable{
		USER("中介用户"),
		ROLE("角色");
		private String userName;
		private Color(String userName) {
			this.userName = userName;
		}
		public String getUserName() {
			return userName;
		}
		
	}
	
}
