import React from "react";
import { connect } from 'react-redux';
import {actFetchProductsRequest, actDeleteProductRequest} from "./redux/action";
import ContentComponent from "../../components/content";

class ProductComponent extends React.Component<any, any> {

    componentDidMount() {
        this.props.fetchAllProducts();

    }
    columns = [];
    render() {
    console.log(this.props.products);

        return(
            <div>
                <ContentComponent />
            </div>
        );
    }
}

const mapStateToProps = (state: any) => {
    return {
        products: state.products
    }
}

const mapDispatchToProps = (dispatch: any, props: any) => {
    return {
        fetchAllProducts : () => {
            dispatch(actFetchProductsRequest());
        },
        onDeleteProduct : (id: number) => {
            dispatch(actDeleteProductRequest(id));
        }
    }
}
export default connect(mapStateToProps, mapDispatchToProps)(ProductComponent);