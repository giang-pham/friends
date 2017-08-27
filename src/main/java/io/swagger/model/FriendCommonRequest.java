package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * friendCommonRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

public class FriendCommonRequest {
  @NotNull
  @JsonProperty("email")
  private List<String> friends = null;

  public FriendCommonRequest friends(List<String> friends) {
    this.friends = friends;
    return this;
  }

   /**
   * Get email
   * @return email
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
    FriendCommonRequest friendCommonRequest = (FriendCommonRequest) o;
    return Objects.equals(this.friends, friendCommonRequest.friends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class friendCommonRequest {\n");

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

