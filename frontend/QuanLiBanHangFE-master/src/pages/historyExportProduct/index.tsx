import React from "react";
import { connect } from "react-redux";
import { actFetchProductsExportHistoryRequest } from "./redux/action";

class HistoryExportProductComponent extends React.Component<any, any> {
    constructor(props: any) {
        super(props);

    }

    render() {
        return(
            <div>
                HistoryExportProductComponent
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
        fetchAllProductsExportHistory: () => {
            dispatch(actFetchProductsExportHistoryRequest());
     
    }
}
}
export default connect(mapStateToProps, mapDispatchToProps)(HistoryExportProductComponent);