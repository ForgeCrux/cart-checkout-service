package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.CartItem;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateCartRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:33:33.240785079Z[GMT]")public class UpdateCartRequest {

  @Valid
  private List<@Valid CartItem> items;

  @Valid
  private List<String> couponCodes;

  public UpdateCartRequest items(List<@Valid CartItem> items) {
    this.items = items;
    return this;
  }

  public UpdateCartRequest addItemsItem(CartItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid   @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid CartItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CartItem> items) {
    this.items = items;
  }

  public UpdateCartRequest couponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  public UpdateCartRequest addCouponCodesItem(String couponCodesItem) {
    if (this.couponCodes == null) {
      this.couponCodes = new ArrayList<>();
    }
    this.couponCodes.add(couponCodesItem);
    return this;
  }

  /**
   * Get couponCodes
   * @return couponCodes
  */
    @Schema(name = "couponCodes", example = "[\"SUMMER10\",\"FREESHIP\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("couponCodes")
  public List<String> getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCartRequest updateCartRequest = (UpdateCartRequest) o;
    return Objects.equals(this.items, updateCartRequest.items) &&
        Objects.equals(this.couponCodes, updateCartRequest.couponCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, couponCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCartRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

