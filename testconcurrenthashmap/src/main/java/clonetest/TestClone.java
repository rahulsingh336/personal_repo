package clonetest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestClone {

  public static void main(String[] args) {
	  UserDdbEntity.ClaimData claimData = new UserDdbEntity.ClaimData();
	  claimData.setApplicationName("test");
	  UserDdbEntity userDdbEntity = new UserDdbEntity();
	  userDdbEntity.setFirstName("test1");
	  userDdbEntity.getData().add(claimData);
	  //
	  UserDdbEntity userDdbEntity_Old = userDdbEntity;

	  userDdbEntity.setFirstName("Changed!");
      System.out.println(userDdbEntity.getFirstName());
      System.out.println(userDdbEntity_Old.getFirstName());
	  ObjectMapper objectMapper = new ObjectMapper();
  }
}
