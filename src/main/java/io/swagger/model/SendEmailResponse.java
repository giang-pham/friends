package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SendEmailResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

public class SendEmailResponse   {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("recipients")
  private List<String> recipients = new ArrayList<String>();

  public SendEmailResponse success(Boolean success) {
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

  public SendEmailResponse recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public SendEmailResponse addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmailResponse sendEmailResponse = (SendEmailResponse) o;
    return Objects.equals(this.success, sendEmailResponse.success) &&
        Objects.equals(this.recipients, sendEmailResponse.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

