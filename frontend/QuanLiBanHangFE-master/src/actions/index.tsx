import * as Types from './../constants/ActionTypes';
import callApi from './../utils/apiCaller';

export const actFetchProductsRequest = () => {
    return (dispatch: any) => {
        return callApi('storeHouses', 'GET', null).then((res: any) => {
            dispatch(actFetchProducts(res.data));
        });
    };
}

export const actFetchProducts = (storeHouses: any) => {
    return {
        type : Types.FETCH_PRODUCTS,
        storeHouses
    }
}

export const actDeleteProductRequest = (id: any) => {
    return (dispatch: any) => {
        return callApi(`storeHouses/${id}`, 'DELETE', null).then((res: any) =>{
            dispatch(actDeleteProduct(id));
        })
    }
}

export const actDeleteProduct = (id: any) => {
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

export const actGetProductRequest = (id: any) => {
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
