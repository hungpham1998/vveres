import * as Types from '../../../constants/ActionTypes';
import callApi from '../../../utils/apiCaller';

export const actFetchProductsExportHistoryRequest = () => {
    return (dispatch: any) => {
        return callApi('product', 'GET', null).then((res: any) => {
            debugger;
            dispatch(actFetchProductsExportHistory(res.data));
        });
    };
}

export const actFetchProductsExportHistory = (products: any) => {
    return {
        type : Types.FETCH_PRODUCTS,
        products
    }
}

