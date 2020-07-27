import * as Types from '../../../constants/ActionTypes';
import callApi from '../../../utils/apiCaller';

export const actFetchCustomersRequest = () => {
    return (dispatch: any) => {
        return callApi('customer', 'GET', null).then((res: any) => {
            debugger;
            dispatch(actFetchCustomers(res.data));
        });
    };
}

export const actFetchCustomers = (customers: any) => {
    return {
        type : Types.FETCH_CUSTOMER,
        customers
    }
}

export const actDeleteCustomersRequest = (id: number) => {
    return (dispatch: any) => {
        return callApi(`customer/${id}`, 'DELETE', null).then(res =>{
            dispatch(actDeleteCustomer(id));
        })
    }
}

export const actDeleteCustomer = (id: number) => {
    return {
        type : Types.DELETE_CUSTOMER,
        id
    }
}

export const actAddCustomerRequest = (customer: any) => {
    return (dispatch: any) => {
        return callApi('customer', 'POST', customer).then((res: any) => {
            dispatch(actAddCustomer(res.data));
        });
    }
}

export const actAddCustomer= (customer: any) => {
    return {
        type : Types.ADD_CUSTOMER,
        customer
    }
}

export const actGetCustomerRequest = (id: number) => {
    return (dispatch: any) => {
        return callApi(`customer/${id}`, 'GET', null).then((res: any) => {
            dispatch(actGetCustomer(res.data));
        });
    }
}

export const actGetCustomer = (customer: any) => {
    return {
        type : Types.EDIT_CUSTOMER,
        customer
    }
}

export const actUpdateCustomerRequest = (product: any) => {
    return (dispatch: any) => {
        return callApi(`products/${product.id}`, 'PUT', product).then((res: any) => {
            dispatch(actUpdateCustomer(res.data));
        });
    }
}

export const actUpdateCustomer = (product: any) => {
    return {
        type : Types.UPDATE_CUSTOMER,
        product
    }
}
