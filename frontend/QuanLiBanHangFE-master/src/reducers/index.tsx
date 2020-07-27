
import { combineReducers } from 'redux';
import products from "../pages/products/redux/reducer";
import stores from "../pages/storeHouse/redux/reducer";

const appReducers = combineReducers({
    products,
    stores
});

export default appReducers;