import { Link } from "react-router-dom";

function DashBoard() {
    return (
        <>
            {/* <p>This is Dashboard page.</p> */}

            <div style={{ display: 'flex', alignItems: 'center', gap: '5%' }}>

                <Link style={{width:'200px'}} to='/counter'>
                
                <h2>Counter</h2></Link>

                <Link style={{width:'200px'}}  to='/digitalwatch'><h2>Digital Watch</h2></Link>
            </div>
        </>
    )
};
export default DashBoard;