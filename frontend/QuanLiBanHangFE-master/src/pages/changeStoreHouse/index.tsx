import React from "react";
import { actFetchStoreHouseRequest,
         actDeleteStoreHouseRequest,
         actAddStoreHouseRequest, 
         actGetStoreHouseRequest, 
         actUpdateStoreHouseRequest
        } from "./redux/action";
import { connect } from 'react-redux';


class ChangeStoreHouseComponent extends React.Component<any, any> {
    constructor(props: any) {
        super(props);

    }

    render() {
        return(
            <div>
                ChangeStoreHouseComponent
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
            dispatch(actFetchStoreHouseRequest());
        },
        onDeleteStore : (id: number) => {
            dispatch(actDeleteStoreHouseRequest(id));
        },
        onAddProduct : (store: any) => {
            dispatch(actAddStoreHouseRequest(store));
        },
        onEditProduct : (id: number) => {
            dispatch(actGetStoreHouseRequest(id));
        },
        onUpdateProduct : (store: any) => {
            dispatch(actUpdateStoreHouseRequest(store));
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(ChangeStoreHouseComponent);