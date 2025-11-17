import { useState } from "react";

function Counter() {

    const [count, setCount] = useState(0);

    const handleInc = () => {
        setCount(count + 1);
    }

    const handleDec = () => {
        setCount(count - 1);
    }

    return (
        <>

            <button onClick={handleInc} >Increment</button>
            <h1>{count}</h1>
            <button onClick={handleDec} >Decrement</button>
        </>
    )
};

export default Counter;