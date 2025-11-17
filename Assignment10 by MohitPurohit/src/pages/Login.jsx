// import { Navigate } from "react-router-dom";

import { Navigate, useNavigate } from "react-router-dom";

function Login() {

    // const [isAuthenticate, setIsAuthenticate] = useState(false);

    const navigate = useNavigate();

    const isAuth = localStorage.getItem("isAuthenticate");

    if (isAuth == "true") {
        return <Navigate to="/dashboard" replace />
    }

    function handleLogin() {
        // setIsAuthenticate(true);
        localStorage.setItem("isAuthenticate", "true");
        navigate("/dashboard");
        // return <Navigate to="/dashboard" replace/>
    }


    //  if(isAuthenticate){
    //     return <Navigate to="/" replace/>
    // }


    // function handleloginAuth(){
    //     onLogin();
    //     navigate("/");
    // }

    return (
        <button onClick={handleLogin}>Login</button>
    )
}

export default Login;