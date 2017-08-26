package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * FriendListResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

public class FriendListResponse   {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("friends")
  private List<String> friends = new ArrayList<String>();

  @JsonProperty("count")
  private Integer count = null;

  public FriendListResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public FriendListResponse friends(List<String> friends) {
    this.friends = friends;
    return this;
  }

  public FriendListResponse addFriendsItem(String friendsItem) {
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

  public FriendListResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendListResponse friendListResponse = (FriendListResponse) o;
    return Objects.equals(this.success, friendListResponse.success) &&
        Objects.equals(this.friends, friendListResponse.friends) &&
        Objects.equals(this.count, friendListResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, friends, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendListResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

