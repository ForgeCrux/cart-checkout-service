package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CreateCartRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:33:33.240785079Z[GMT]")
@Document(collection = "cart_checkout_service_carts")
public class CreateCartRequest {

    private String customerId;

    private String sessionId;

    private String currency = "USD";

    public CreateCartRequest customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get customerId
     * @return customerId
     */
    @Schema(name = "customerId", example = "cust-88213", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CreateCartRequest sessionId(String sessionId) {
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

    public CreateCartRequest currency(String currency) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCartRequest createCartRequest = (CreateCartRequest) o;
        return Objects.equals(this.customerId, createCartRequest.customerId) && Objects.equals(this.sessionId, createCartRequest.sessionId) && Objects.equals(this.currency, createCartRequest.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, sessionId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCartRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    @Id()
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
