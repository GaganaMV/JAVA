package special;

public class SetLoginEntity {
	LoginEntity loginEntity;
	
	public SetLoginEntity(LoginEntity loginEntity) {
		this.loginEntity=loginEntity;
	}
	
	public void SetEntities() {
		loginEntity.setUserId(202218);
		loginEntity.setPassword("Tanu18*");
		
	}
}
