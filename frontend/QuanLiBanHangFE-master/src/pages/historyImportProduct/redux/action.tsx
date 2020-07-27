import * as Types from '../../../constants/ActionTypes';
import callApi from '../../../utils/apiCaller';

export const actFetchProductsRequest = () => {
    return (dispatch: any) => {
        return callApi('product', 'GET', null).then((res: any) => {
            debugger;
            dispatch(actFetchProducts(res.data));
        });
    };
}

export const actFetchProducts = (products: any) => {
    return {
        type : Types.FETCH_PRODUCTS,
        products
    }
}

export const actDeleteProductRequest = (id: number) => {
    return (dispatch: any) => {
        return callApi(`products/${id}`, 'DELETE', null).then(res =>{
            dispatch(actDeleteProduct(id));
        })
    }
}

export const actDeleteProduct = (id: number) => {
    return {
        type : Types.DELETE_PRODUCT,
        id
    }
}

export const actAddProductRequest = (product: any) => {
    return (dispatch: any) => {
        return callApi('products', 'POST', product).then((res: any) => {
            dispatch(actAddProduct(res.data));
        });
    }
}

export const actAddProduct = (product: any) => {
    return {
        type : Types.ADD_PRODUCT,
        product
    }
}

export const actGetProductRequest = (id: number) => {
    return (dispatch: any) => {
        return callApi(`products/${id}`, 'GET', null).then((res: any) => {
            dispatch(actGetProduct(res.data));
        });
    }
}

export const actGetProduct = (product: any) => {
    return {
        type : Types.EDIT_PRODUCT,
        product
    }
}

export const actUpdateProductRequest = (product: any) => {
    return (dispatch: any) => {
        return callApi(`products/${product.id}`, 'PUT', product).then((res: any) => {
            dispatch(actUpdateProduct(res.data));
        });
    }
}

export const actUpdateProduct = (product: any) => {
    return {
        type : Types.UPDATE_PRODUCT,
        product
    }
}
