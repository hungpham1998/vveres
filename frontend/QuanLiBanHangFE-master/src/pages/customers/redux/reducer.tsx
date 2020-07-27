import * as Types from '../../../constants/ActionTypes';
var initialState: any = [];

var findIndex = (customers: any, id: number) => {
    var result = -1;
    customers.forEach((customer: any, index: number) => {
        if (customer.id === id) {
            result = index;
        }
    });
    return result;
}

const customers = (state = initialState, action: any) => {
    var index = -1;
    var { id, customer } = action;
    switch (action.type) {
        case Types.FETCH_CUSTOMER:
            state = action.customers;
            return [...state];
        case Types.DELETE_CUSTOMER:
            index = findIndex(state, id);
            state.splice(index, 1);
            return [...state];
        case Types.ADD_CUSTOMER:
            state.push(action.customer);
            return [...state];
        case Types.UPDATE_CUSTOMER:
            index = findIndex(state, customer.id);
            state[index] = customer;
            return [...state];
        default: return [...state];
    }
};

export default customers;