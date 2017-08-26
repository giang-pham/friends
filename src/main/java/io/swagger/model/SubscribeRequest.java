package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SubscribeRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

public class SubscribeRequest   {
  @JsonProperty("requestor")
  private String requestor = null;

  @JsonProperty("target")
  private String target = null;

  public SubscribeRequest requestor(String requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(example = "andy@example.com", value = "")
  public String getRequestor() {
    return requestor;
  }

  public void setRequestor(String requestor) {
    this.requestor = requestor;
  }

  public SubscribeRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(example = "john@example.com", value = "")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeRequest subscribeRequest = (SubscribeRequest) o;
    return Objects.equals(this.requestor, subscribeRequest.requestor) &&
        Objects.equals(this.target, subscribeRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestor, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRequest {\n");
    
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

