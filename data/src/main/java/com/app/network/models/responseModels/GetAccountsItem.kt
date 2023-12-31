package com.app.network.models.responseModels

data class GetAccountsItem(
    val ACCOUNT_NO: String,
    val ACCOUNT_TYPE: String,
    val BALANCE: String,
    val BALANCE_LC: String,
    val BLOCKSAMOUNT: String,
    val BLOCKSTATUS: String,
    val BRANCH_NAME: String,
    val BRANCH_NO: String,
    val CCY_NAME: String,
    val COMPASSACCOUNT: String,
    val CREDIT_BALANCE: String,
    val CUSTOMER_NO: Int,
    val DEBIT_BALANCE: String,
    val IBAN: String,
    val INTEREST_ACC: String,
    val LAST_BALANCE: String,
    val LAST_DAY_BALANCE: String,
    val NICKNAME: String,
    val OPENDATE: String,
    val ORJ_IBAN: String,
    val PRODUCT_CODE: String,
    val PRODUCT_NAME: String,
    val REAL_BALANCE: String,
    val STATUS: String,
    val WFA_AMOUNT: String,
    val WFA_COMMISSION: String,
    val WFA_CREDIT: String,
    val WFA_DEBIT: String,
    val ccyId: Any,
    val productId: Any
)