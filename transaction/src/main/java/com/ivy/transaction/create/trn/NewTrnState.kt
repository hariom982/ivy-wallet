package com.ivy.transaction.create.trn

import androidx.compose.runtime.Immutable
import androidx.compose.ui.focus.FocusRequester
import com.ivy.core.domain.pure.format.ValueUi
import com.ivy.core.ui.data.CategoryUi
import com.ivy.core.ui.data.account.AccountUi
import com.ivy.core.ui.data.transaction.TrnTimeUi
import com.ivy.data.transaction.TransactionType
import com.ivy.design.l2_components.modal.IvyModal

@Immutable
data class NewTrnState(
    val trnType: TransactionType,
    val amount: ValueUi,
    val account: AccountUi?,
    val category: CategoryUi?,
    val time: TrnTimeUi,
    val title: String?,
    val description: String?,

    // region Create flow
    val amountModal: IvyModal,
    val categoryModal: IvyModal,
    val titleFocus: FocusRequester,
    val descriptionModal: IvyModal,
    val trnTimeModal: IvyModal,
    val trnTypeModal: IvyModal,
    // endregion
)