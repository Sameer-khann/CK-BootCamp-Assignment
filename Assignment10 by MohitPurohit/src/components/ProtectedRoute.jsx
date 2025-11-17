import { Navigate } from "react-router-dom";

function ProtectedRoute({children}){
    
    // const navigate = useNavigate();

    const isAuth = localStorage.getItem("isAuthenticate");
    console.log(isAuth)

    if(isAuth != "true"){
        return <Navigate to='/' />
    }
    return children;
};
export default ProtectedRoute;