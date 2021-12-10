import React, { useEffect, useState } from 'react'
import { Button } from './Button'

const Home = () => {
    const [clients, setClients] = useState(null)
    const BASE_URL = "http://localhost:9696/client";

    // useEffect(() => {


    // }, [clients])

    const fetchAll = async () => {
        const res = await fetch(`${BASE_URL}/get-all`)
        return await res.json()
    }

    const fetchAllMen = async () =>{
        const res = await fetch(`${BASE_URL}/get-all-men`)
        return await res.json()
    }

    const fetchAllOntario = async () =>{
        const res = await fetch(`${BASE_URL}/get-all-ontario`)
        return await res.json()
    }


    return (
        <div>
            <Button
                setClients={setClients}
                fetchMethod={fetchAll}
                text={"Fetch tous les clients"}
            />
            <Button
                setClients={setClients}
                fetchMethod={fetchAllMen}
                text={"Fetch hommes"}
            />
            <Button
                setClients={setClients}
                fetchMethod={fetchAllOntario}
                text={"Fetch ontariens"}
            />
            <h1>Hello</h1>
            <table>
                <tr>
                    <th>Client Id</th>
                    <th>Prénom</th>
                    <th>Nom</th>
                    <th>Sexe</th>
                    <th>Date de naissance</th>
                </tr>
                {clients &&
                    <>
                        {clients.map((client) => (
                            <tr key={client.id}>
                                <td>{client.id}</td>
                                <td>{client.firstName}</td>
                                <td>{client.lastName}</td>
                                <td>{client.gender}</td>
                                <td>{client.birthDate}</td>
                            </tr>
                        ))}
                    </>
                }
            </table>
        </div>
    )
}

export default Home
