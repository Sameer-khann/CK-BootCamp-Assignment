import { useEffect, useState } from "react";

function DigitalWatch() {

    const [clock, setClock] = useState(() => new Date());

    useEffect(() => {

        const cur = new Date();
        const avoidDrift = 1000 - cur.getMilliseconds();

        const updateTime = setTimeout(() => {

            const clockUpdate = setInterval(() => {
                setClock(new Date());
            }, 1000)

            return () => clearInterval(clockUpdate);
        }, avoidDrift)

        return () => clearTimeout(updateTime);

    }, [])


    return (
        <>
            {/* <p>This is Digital Watch.</p> */}

            <div>
                <h2>
                    {clock.toLocaleDateString()}
                </h2>
                <h1>
                    {clock.toLocaleTimeString()}
                </h1>
            </div>

        </>
    )
};
export default DigitalWatch;