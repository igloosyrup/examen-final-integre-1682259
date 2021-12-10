import React from 'react'

export const Button = ({ fetchMethod, setClients, text }) => {

    const fetchAndSet = async () => {
        const clientsFromServer = await fetchMethod()
            .then(data => data !== null && data !== undefined ? setClients(data) : alert("erreur"))
            .catch(err => alert(err));
    }

    return (
        <div>
            <button type="submit" onClick={fetchAndSet}>{text}</button>
        </div>
    )
}
