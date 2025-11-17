import { Outlet } from "react-router-dom";

function NavLayout(){
    

    return(
        <>
        <div style={{backgroundColor:'aqua'}}>

            <ul>Counter</ul>
            <ul>Watch</ul>
        </div>
            <Outlet/>
        </>
    );
}

export default NavLayout;