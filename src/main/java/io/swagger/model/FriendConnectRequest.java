package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * FriendConnectRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

public class FriendConnectRequest   {
  @JsonProperty("friends")
  @NotNull
  private List<String> friends = new ArrayList<String>();

  public FriendConnectRequest friends(List<String> friends) {
    this.friends = friends;
    return this;
  }

  public FriendConnectRequest addFriendsItem(String friendsItem) {
    this.friends.add(friendsItem);
    return this;
  }

   /**
   * Get friends
   * @return friends
  **/
  @ApiModelProperty(value = "")
  public List<String> getFriends() {
    return friends;
  }

  public void setFriends(List<String> friends) {
    this.friends = friends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendConnectRequest friendConnectRequest = (FriendConnectRequest) o;
    return Objects.equals(this.friends, friendConnectRequest.friends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendConnectRequest {\n");
    
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

