package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.CartItem;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Cart
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:37:09.209445517Z[GMT]")public class Cart {

  private String id;

  private String customerId;

  private String sessionId;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    ABANDONED("ABANDONED"),
    
    CONVERTED("CONVERTED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StateEnum state;

  private String currency;

  @Valid
  private List<@Valid CartItem> items;

  @Valid
  private List<String> couponCodes;

  private Double subtotal;

  private Double discountTotal;

  private Double grandTotal;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Cart() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Cart(String id, StateEnum state, Double grandTotal) {
    this.id = id;
    this.state = state;
    this.grandTotal = grandTotal;
  }

  public Cart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique cart ID (UUID)
   * @return id
  */
  @NotNull   @Schema(name = "id", example = "c1a2r3t4", description = "Unique cart ID (UUID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Cart customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Null for guest carts
   * @return customerId
  */
    @Schema(name = "customerId", example = "cust-88213", description = "Null for guest carts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Cart sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
    @Schema(name = "sessionId", example = "sess-9f8e7d", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Cart state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull   @Schema(name = "state", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Cart currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
    @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Cart items(List<@Valid CartItem> items) {
    this.items = items;
    return this;
  }

  public Cart addItemsItem(CartItem itemsItem) {
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

  public Cart couponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  public Cart addCouponCodesItem(String couponCodesItem) {
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
    @Schema(name = "couponCodes", example = "[\"SUMMER10\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("couponCodes")
  public List<String> getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  public Cart subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * Get subtotal
   * @return subtotal
  */
    @Schema(name = "subtotal", example = "89.98", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtotal")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public Cart discountTotal(Double discountTotal) {
    this.discountTotal = discountTotal;
    return this;
  }

  /**
   * Get discountTotal
   * @return discountTotal
  */
    @Schema(name = "discountTotal", example = "9.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountTotal")
  public Double getDiscountTotal() {
    return discountTotal;
  }

  public void setDiscountTotal(Double discountTotal) {
    this.discountTotal = discountTotal;
  }

  public Cart grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

  /**
   * Get grandTotal
   * @return grandTotal
  */
  @NotNull   @Schema(name = "grandTotal", example = "80.98", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grandTotal")
  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public Cart expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  */
  @Valid   @Schema(name = "expiresAt", example = "2026-08-19T10:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresAt")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Cart updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", example = "2026-08-12T10:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.id, cart.id) &&
        Objects.equals(this.customerId, cart.customerId) &&
        Objects.equals(this.sessionId, cart.sessionId) &&
        Objects.equals(this.state, cart.state) &&
        Objects.equals(this.currency, cart.currency) &&
        Objects.equals(this.items, cart.items) &&
        Objects.equals(this.couponCodes, cart.couponCodes) &&
        Objects.equals(this.subtotal, cart.subtotal) &&
        Objects.equals(this.discountTotal, cart.discountTotal) &&
        Objects.equals(this.grandTotal, cart.grandTotal) &&
        Objects.equals(this.expiresAt, cart.expiresAt) &&
        Objects.equals(this.updatedAt, cart.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, sessionId, state, currency, items, couponCodes, subtotal, discountTotal, grandTotal, expiresAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    discountTotal: ").append(toIndentedString(discountTotal)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

