package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Cart;
import com.probestack.forgestudio.design.model.CartListResponse;
import com.probestack.forgestudio.design.model.CreateCartRequest;
import com.probestack.forgestudio.design.model.UpdateCartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.CartsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:33:33.240785079Z[GMT]")
@Controller
@RequestMapping("${openapi.cartCheckoutService.base-path:/v1}")
public class CartsApiController implements CartsApi {

    private static final Logger log = LoggerFactory.getLogger(CartsApiController.class);

    private final CartsService cartsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public CartsApiController(CartsService cartsService, GeneratedRequestValidator generatedRequestValidator) {
        this.cartsService = cartsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Cart> createCart(@RequestBody() CreateCartRequest createCartRequest) {
        log.info("Processing createCart request");
        try {
            generatedRequestValidator.validate("createCart", createCartRequest);
            var response = cartsService.createCart(createCartRequest);
            log.info("createCart completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createCart: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> emptyCart(@PathVariable() String cartId) {
        log.info("Processing emptyCart request");
        try {
            var response = cartsService.emptyCart(cartId);
            log.info("emptyCart completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process emptyCart: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Cart> getCartById(@PathVariable() String cartId) {
        log.info("Processing getCartById request");
        try {
            var response = cartsService.getCartById(cartId);
            log.info("getCartById completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getCartById: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<CartListResponse> listCarts(@RequestParam() String customerId, @RequestParam() String state, @RequestParam() Integer page, @RequestParam() Integer size) {
        log.info("Processing listCarts request");
        try {
            var response = cartsService.listCarts(customerId, state, page, size);
            log.info("listCarts completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listCarts: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Cart> updateCart(@PathVariable() String cartId, @RequestBody() UpdateCartRequest updateCartRequest) {
        log.info("Processing updateCart request");
        try {
            generatedRequestValidator.validate("updateCart", updateCartRequest);
            var response = cartsService.updateCart(cartId, updateCartRequest);
            log.info("updateCart completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateCart: {}", e.getMessage(), e);
            throw e;
        }
    }
}
