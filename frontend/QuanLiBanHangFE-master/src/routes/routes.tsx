import React from 'react';
import StoreHouseComponent from "../pages/storeHouse/storeHouse";
import ProductComponent from '../pages/products/product';
import CustomerComponent from '../pages/customers/customers';
import StaffmentComponent from '../pages/staffment/staffment';
import SupplierComponent from '../pages/suppliers/supplier';
import ImportProductComponent from '../pages/importProduct';
import ExportProductComponent from '../pages/exportProduct';
import ChangeStoreHouseComponent from '../pages/changeStoreHouse';
import ListOfBillImportComponent from '../pages/listOfBillImport';
import ListOfBillExportComponent from '../pages/listOfBillExport';
import HistoryOfChangeStoreHouseComponent from '../pages/historyOfChangeStoreHouse';
import HistoryExportProductComponent from '../pages/historyExportProduct';
import InventoryProductComponent from '../pages/inventoryProduct';
import HistoryImportProductComponent from '../pages/historyImportProduct';

const routes = [
    {
        path: '/store',
        exact: true,
        main: () => <StoreHouseComponent />
     },
    {
        path: '/product',
        exact: false,
        main: () => <ProductComponent />
    // },
    // {
    //     path: '/product/add',
    //     exact: false,
    //     main: ({history: any}) => <ProductActionPage history={history}/>
    // },
    // {
    //     path: '/product/:id/edit',
    //     exact: false,
    //     main: ({match, history}) => <ProductActionPage match={match} history={history}/>
    // },
    // {
    //     path: '',
    //     exact: false,
    //     main: () => <NotFoundPage />
    },
    {
        path: '/customer',
        exact: true,
        main: () => <CustomerComponent />
     },
     {
        path: '/staffment',
        exact: true,
        main: () => <StaffmentComponent />
     },
     {
        path: '/supplier',
        exact: true,
        main: () => <SupplierComponent />
     },
     {
        path: '/importProduct',
        exact: true,
        main: () => <ImportProductComponent />
     },
     {
        path: '/exportProduct',
        exact: true,
        main: () => <ExportProductComponent />
     },
     {
        path: '/changeStore',
        exact: true,
        main: () => <ChangeStoreHouseComponent />
     },
     {
        path: '/listOfImportBill',
        exact: true,
        main: () => <ListOfBillImportComponent />
     },
     {
        path: '/listOfBillExport',
        exact: true,
        main: () => <ListOfBillExportComponent />
     },
     {
        path: '/historyOfChangeStore',
        exact: true,
        main: () => <HistoryOfChangeStoreHouseComponent />
     },
     {
        path: '/historyOfImportProduct',
        exact: true,
        main: () => <HistoryImportProductComponent />
     },
     {
        path: '/historyOfExportProduct',
        exact: true,
        main: () => <HistoryExportProductComponent />
     },
     {
        path: '/inventoryProduct',
        exact: true,
        main: () => <InventoryProductComponent />
     }


];

export default routes;