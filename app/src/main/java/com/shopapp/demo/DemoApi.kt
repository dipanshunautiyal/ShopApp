package com.shopapp.demo

import com.shopapp.gateway.Api
import com.shopapp.gateway.ApiCallback
import com.shopapp.gateway.entity.*
import java.math.BigDecimal
import java.util.*

class DemoApi : Api {

    private fun <T> fail(callback: ApiCallback<T>) {
        callback.onFailure(Error.Content())
    }

    override fun getProductList(perPage: Int, paginationValue: Any?, sortBy: SortType?,
                                keyword: String?, excludeKeyword: String?, callback: ApiCallback<List<Product>>) {
        callback.onResult(emptyList())
    }

    override fun getProductVariantList(productVariantIdList: List<String>, callback: ApiCallback<List<ProductVariant>>) {
        callback.onResult(emptyList())
    }

    override fun searchProductList(perPage: Int, paginationValue: Any?, searchQuery: String,
                                   callback: ApiCallback<List<Product>>) {
        callback.onResult(emptyList())
    }

    override fun getProduct(id: String, callback: ApiCallback<Product>) {
        fail(callback)
    }

    override fun getCategoryList(perPage: Int, paginationValue: Any?, callback: ApiCallback<List<Category>>) {
        callback.onResult(emptyList())
    }

    override fun getCategoryDetails(id: String, perPage: Int, paginationValue: Any?, sortBy: SortType?,
                                    callback: ApiCallback<Category>) {
        fail(callback)
    }

    override fun getShopInfo(callback: ApiCallback<Shop>) {
        // Provide minimal shop info
        val shop = Shop("Demo Shop", "Demo description", "", "", "")
        callback.onResult(shop)
    }

    override fun getArticleList(perPage: Int, paginationValue: Any?, sortBy: SortType?,
                                reverse: Boolean, callback: ApiCallback<List<Article>>) {
        callback.onResult(emptyList())
    }

    override fun signUp(firstName: String, lastName: String, email: String, password: String, phone: String, callback: ApiCallback<Unit>) {
        callback.onResult(Unit)
    }

    override fun signIn(email: String, password: String, callback: ApiCallback<Unit>) {
        callback.onResult(Unit)
    }

    override fun signOut(callback: ApiCallback<Unit>) { callback.onResult(Unit) }

    override fun isLoggedIn(callback: ApiCallback<Boolean>) { callback.onResult(false) }

    override fun forgotPassword(email: String, callback: ApiCallback<Unit>) { callback.onResult(Unit) }

    override fun getCustomer(callback: ApiCallback<Customer?>) { callback.onResult(null) }

    override fun setDefaultShippingAddress(addressId: String, callback: ApiCallback<Unit>) { fail(callback) }

    override fun createCustomerAddress(address: Address, callback: ApiCallback<String>) { fail(callback) }

    override fun editCustomerAddress(addressId: String, address: Address, callback: ApiCallback<Unit>) { fail(callback) }

    override fun deleteCustomerAddress(addressId: String, callback: ApiCallback<Unit>) { fail(callback) }

    override fun getArticle(id: String, callback: ApiCallback<Pair<Article, String>>) { fail(callback) }

    override fun getOrders(perPage: Int, paginationValue: Any?, callback: ApiCallback<List<Order>>) { callback.onResult(emptyList()) }

    override fun getOrder(orderId: String, callback: ApiCallback<Order>) { fail(callback) }

    override fun editCustomerInfo(firstName: String, lastName: String, phone: String, callback: ApiCallback<Customer>) { fail(callback) }

    override fun changePassword(password: String, callback: ApiCallback<Unit>) { fail(callback) }

    override fun updateCustomerSettings(isAcceptMarketing: Boolean, callback: ApiCallback<Unit>) { callback.onResult(Unit) }

    override fun getCountries(callback: ApiCallback<List<Country>>) { callback.onResult(emptyList()) }

    override fun createCheckout(cartProductList: List<CartProduct>, callback: ApiCallback<Checkout>) { fail(callback) }

    override fun getCheckout(checkoutId: String, callback: ApiCallback<Checkout>) { fail(callback) }

    override fun setShippingAddress(checkoutId: String, address: Address, callback: ApiCallback<Checkout>) { fail(callback) }

    override fun getShippingRates(checkoutId: String, callback: ApiCallback<List<ShippingRate>>) { callback.onResult(emptyList()) }

    override fun selectShippingRate(checkoutId: String, shippingRate: ShippingRate, callback: ApiCallback<Checkout>) { fail(callback) }

    override fun getAcceptedCardTypes(callback: ApiCallback<List<CardType>>) { callback.onResult(emptyList()) }

    override fun getCardToken(card: Card, callback: ApiCallback<String>) { fail(callback) }

    override fun completeCheckoutByCard(checkout: Checkout, email: String, address: Address, creditCardVaultToken: String, callback: ApiCallback<Order>) { fail(callback) }

}
