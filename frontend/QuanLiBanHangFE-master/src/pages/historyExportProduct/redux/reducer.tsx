import * as Types from '../../../constants/ActionTypes';
var initialState: any = [];

var findIndex = (productsExportHistory: any, id: number) => {
    var result = -1;
    productsExportHistory.forEach((productExportHistory: any, index: number) => {
        if (productExportHistory.id === id) {
            result = index;
        }
    });
    return result;
}

const productExportHistory = (state = initialState, action: any) => {
    var index = -1;
    var { id, product } = action;
    switch (action.type) {
        case Types.FETCH_PRODUCTSEXPORTHISTORY:
            state = action.products;
            return [...state];
       
        default: return [...state];
    }
};

export default productExportHistory;