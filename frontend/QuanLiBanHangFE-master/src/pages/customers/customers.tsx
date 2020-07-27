import React from "react";
import { actFetchCustomersRequest, actDeleteCustomersRequest, actAddCustomerRequest, actGetCustomerRequest, actUpdateCustomerRequest } from "./redux/action";
import { connect } from "react-redux";

class CustomerComponent extends React.Component<any, any> {
    constructor(props: any) {
        super(props);

    }

    render() {
        return(
            <div>
                CustomerComponent
            </div>
        )
    }
}

const mapStateToProps = (state: any) => {
    return {
        stores: state.stores,
        itemEditing : state.itemEditing
    }
}

const mapDispatchToProps = (dispatch: any, props: any) => {
    return {
        fetchAllStores : () => {
            dispatch(actFetchCustomersRequest());
        },
        onDeleteStore : (id: number) => {
            dispatch(actDeleteCustomersRequest(id));
        },
        onAddProduct : (store: any) => {
            dispatch(actAddCustomerRequest(store));
        },
        onEditProduct : (id: number) => {
            dispatch(actGetCustomerRequest(id));
        },
        onUpdateProduct : (store: any) => {
            dispatch(actUpdateCustomerRequest(store));
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(CustomerComponent);